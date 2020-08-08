package com.weChat.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "article_type")
public class ArticleType {
    /**
     * 表主键 - uuid
     */
    @Id
    @Column(name = "ARTICLETYPE_UUID")
    private String articletypeUuid;

    /**
     * 文章类型名称
     */
    @Column(name = "ARTICLETYPE_NAME")
    private String articletypeName;

    /**
     * 类型状态（1:启用，0:停用），停用时不给予显示相应文章；
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 获取表主键 - uuid
     *
     * @return ARTICLETYPE_UUID - 表主键 - uuid
     */
    public String getArticletypeUuid() {
        return articletypeUuid;
    }

    /**
     * 设置表主键 - uuid
     *
     * @param articletypeUuid 表主键 - uuid
     */
    public void setArticletypeUuid(String articletypeUuid) {
        this.articletypeUuid = articletypeUuid == null ? null : articletypeUuid.trim();
    }

    /**
     * 获取文章类型名称
     *
     * @return ARTICLETYPE_NAME - 文章类型名称
     */
    public String getArticletypeName() {
        return articletypeName;
    }

    /**
     * 设置文章类型名称
     *
     * @param articletypeName 文章类型名称
     */
    public void setArticletypeName(String articletypeName) {
        this.articletypeName = articletypeName == null ? null : articletypeName.trim();
    }

    /**
     * 获取类型状态（1:启用，0:停用），停用时不给予显示相应文章；
     *
     * @return STATUS - 类型状态（1:启用，0:停用），停用时不给予显示相应文章；
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置类型状态（1:启用，0:停用），停用时不给予显示相应文章；
     *
     * @param status 类型状态（1:启用，0:停用），停用时不给予显示相应文章；
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}