/*
 * The MIT License
 *
 * Copyright 2016 Isaac Aymerich <isaac.aymerich@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Isaac Aymerich <isaac.aymerich@gmail.com>
 */
@JsonSerialize
public class ScalewayImage {

    private String id;

    @JsonProperty("modification_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date modificationDate;

    @JsonProperty("creation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date creationDate;

    @JsonProperty("default_bootscript")
    private BootScript defaultbootscript;

    private String organization;

    private String arch;

    @JsonProperty("root_volume")
    private ScalewayVolume rootVolume;

    @JsonProperty("state")
    private ScalewayImageState state;

    private String name;
    @JsonProperty("extra_volumes")
    @JsonDeserialize(contentAs = ScalewayVolume.class)
    private List<ScalewayVolume> extraVolumes;
    @JsonProperty("public")
    private boolean publicImage;
    @JsonProperty("from_image")
    private ScalewayImage fromImage;

    @JsonProperty("from_server")
    private ScalewayServerTemplate fromServer;
    @JsonProperty("marketplace_key")
    private String marketplaceKey;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isPublicImage() {
        return publicImage;
    }

    public void setPublicImage(boolean publicImage) {
        this.publicImage = publicImage;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public BootScript getDefaultbootscript() {
        return defaultbootscript;
    }

    public void setDefaultbootscript(BootScript defaultbootscript) {
        this.defaultbootscript = defaultbootscript;
    }

    public ScalewayVolume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(ScalewayVolume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ScalewayVolume> getExtraVolumes() {
        return extraVolumes;
    }

    public void setExtraVolumes(Object extraVolumes) {
        if (extraVolumes instanceof List) {
            this.extraVolumes = (List) extraVolumes;
        } else {

        }

    }

    public ScalewayImage getFromImage() {
        return fromImage;
    }

    public void setFromImage(ScalewayImage fromImage) {
        this.fromImage = fromImage;
    }

    public ScalewayServerTemplate getFromServer() {
        return fromServer;
    }

    public void setFromServer(ScalewayServerTemplate fromServer) {
        this.fromServer = fromServer;
    }

    public String getMarketplaceKey() {
        return marketplaceKey;
    }

    public void setMarketplaceKey(String marketplaceKey) {
        this.marketplaceKey = marketplaceKey;
    }

    public ScalewayImageState getState() {
        return state;
    }

    public void setState(ScalewayImageState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ScalewayImage{" + "id=" + id + ", modificationDate=" + modificationDate + ", creationDate=" + creationDate + ", defaultbootscript=" + defaultbootscript + ", organization=" + organization + ", arch=" + arch + ", rootVolume=" + rootVolume + ", state=" + state + ", name=" + name + ", extraVolumes=" + extraVolumes + ", publicImage=" + publicImage + ", fromImage=" + fromImage + ", fromServer=" + fromServer + ", marketplaceKey=" + marketplaceKey + '}';
    }

}
