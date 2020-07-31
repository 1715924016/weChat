package com.weChat.entity;

import javax.persistence.*;

@Table(name = "article_publisher")
public class ArticlePublisher {
    /**
     * 表主键 - uuid
     */
    @Id
    @Column(name = "PUBLISHER_UUID")
    private String publisherUuid;

    /**
     * 发布者名称
     */
    @Column(name = "PUBLISHER_NAME")
    private String publisherName;

    /**
     * 发布者头像路径
     */
    @Column(name = "PUBLISHER_IMAGE")
    private String publisherImage;

    /**
     * 发布者状态（0:启用，1:停用），停用时不可发布文章且之前文章不给予展示
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 获取表主键 - uuid
     *
     * @return PUBLISHER_UUID - 表主键 - uuid
     */
    public String getPublisherUuid() {
        return publisherUuid;
    }

    /**
     * 设置表主键 - uuid
     *
     * @param publisherUuid 表主键 - uuid
     */
    public void setPublisherUuid(String publisherUuid) {
        this.publisherUuid = publisherUuid == null ? null : publisherUuid.trim();
    }

    /**
     * 获取发布者名称
     *
     * @return PUBLISHER_NAME - 发布者名称
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * 设置发布者名称
     *
     * @param publisherName 发布者名称
     */
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName == null ? null : publisherName.trim();
    }

    /**
     * 获取发布者头像路径
     *
     * @return PUBLISHER_IMAGE - 发布者头像路径
     */
    public String getPublisherImage() {
        return publisherImage;
    }

    /**
     * 设置发布者头像路径
     *
     * @param publisherImage 发布者头像路径
     */
    public void setPublisherImage(String publisherImage) {
        this.publisherImage = publisherImage == null ? null : publisherImage.trim();
    }

    /**
     * 获取发布者状态（0:启用，1:停用），停用时不可发布文章且之前文章不给予展示
     *
     * @return STATUS - 发布者状态（0:启用，1:停用），停用时不可发布文章且之前文章不给予展示
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置发布者状态（0:启用，1:停用），停用时不可发布文章且之前文章不给予展示
     *
     * @param status 发布者状态（0:启用，1:停用），停用时不可发布文章且之前文章不给予展示
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}