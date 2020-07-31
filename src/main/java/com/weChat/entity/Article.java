package com.weChat.entity;

import java.util.Date;
import javax.persistence.*;

public class Article {
    /**
     * 表主键 - uuid
     */
    @Id
    @Column(name = "UUID")
    private String uuid;

    /**
     * 关联的分类表主键 - uuid
     */
    @Column(name = "TYPE_UUID")
    private String typeUuid;

    /**
     * 文章图片显示类型（0:无图，1:一张，3:三张）
     */
    @Column(name = "IMAGE_TYPE")
    private String imageType;

    /**
     * 当image_type不为空时image_path不为空
     * [“”，“”]    json串的形式
     */
    @Column(name = "IMAGE_PATH")
    private String imagePath;

    /**
     * 文章标题
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 关联的发布者表主键 - uuid
     */
    @Column(name = "PUBLISHER_UUID")
    private String publisherUuid;

    /**
     * 发布时间
     */
    @Column(name = "PUBLISH_TIME")
    private Date publishTime;

    /**
     * 文章内容
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 获取表主键 - uuid
     *
     * @return UUID - 表主键 - uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 设置表主键 - uuid
     *
     * @param uuid 表主键 - uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * 获取关联的分类表主键 - uuid
     *
     * @return TYPE_UUID - 关联的分类表主键 - uuid
     */
    public String getTypeUuid() {
        return typeUuid;
    }

    /**
     * 设置关联的分类表主键 - uuid
     *
     * @param typeUuid 关联的分类表主键 - uuid
     */
    public void setTypeUuid(String typeUuid) {
        this.typeUuid = typeUuid == null ? null : typeUuid.trim();
    }

    /**
     * 获取文章图片显示类型（0:无图，1:一张，3:三张）
     *
     * @return IMAGE_TYPE - 文章图片显示类型（0:无图，1:一张，3:三张）
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * 设置文章图片显示类型（0:无图，1:一张，3:三张）
     *
     * @param imageType 文章图片显示类型（0:无图，1:一张，3:三张）
     */
    public void setImageType(String imageType) {
        this.imageType = imageType == null ? null : imageType.trim();
    }

    /**
     * 获取当image_type不为空时image_path不为空
     * [“”，“”]    json串的形式
     *
     * @return IMAGE_PATH - 当image_type不为空时image_path不为空
     * [“”，“”]    json串的形式
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * 设置当image_type不为空时image_path不为空
     * [“”，“”]    json串的形式
     *
     * @param imagePath 当image_type不为空时image_path不为空
     *                  [“”，“”]    json串的形式
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    /**
     * 获取文章标题
     *
     * @return TITLE - 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置文章标题
     *
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取关联的发布者表主键 - uuid
     *
     * @return PUBLISHER_UUID - 关联的发布者表主键 - uuid
     */
    public String getPublisherUuid() {
        return publisherUuid;
    }

    /**
     * 设置关联的发布者表主键 - uuid
     *
     * @param publisherUuid 关联的发布者表主键 - uuid
     */
    public void setPublisherUuid(String publisherUuid) {
        this.publisherUuid = publisherUuid == null ? null : publisherUuid.trim();
    }

    /**
     * 获取发布时间
     *
     * @return PUBLISH_TIME - 发布时间
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * 设置发布时间
     *
     * @param publishTime 发布时间
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * 获取文章内容
     *
     * @return CONTENT - 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置文章内容
     *
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}