package com.example.mvvm.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

        @SerializedName("id")
        @Expose
        private Long id;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("date_gmt")
        @Expose
        private String dateGmt;
        @SerializedName("guid")
        @Expose
        private Guid guid;
        @SerializedName("modified")
        @Expose
        private String modified;
        @SerializedName("modified_gmt")
        @Expose
        private String modifiedGmt;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("title")
        @Expose
        private Title title;
        @SerializedName("content")
        @Expose
        private Content content;
        @SerializedName("excerpt")
        @Expose
        private Excerpt excerpt;
        @SerializedName("author")
        @Expose
        private Long author;
        @SerializedName("featured_media")
        @Expose
        private Long featuredMedia;
        @SerializedName("parent")
        @Expose
        private Long parent;
        @SerializedName("menu_order")
        @Expose
        private Long menuOrder;
        @SerializedName("comment_status")
        @Expose
        private String commentStatus;
        @SerializedName("ping_status")
        @Expose
        private String pingStatus;
        @SerializedName("template")
        @Expose
        private String template;
        @SerializedName("meta")
        @Expose
        private Meta meta;
        @SerializedName("yoast_head")
        @Expose
        private String yoastHead;
        @SerializedName("_links")
        @Expose
        private Links links;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", dateGmt='" + dateGmt + '\'' +
                ", guid=" + guid +
                ", modified='" + modified + '\'' +
                ", modifiedGmt='" + modifiedGmt + '\'' +
                ", slug='" + slug + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", link='" + link + '\'' +
                ", title=" + title +
                ", content=" + content +
                ", excerpt=" + excerpt +
                ", author=" + author +
                ", featuredMedia=" + featuredMedia +
                ", parent=" + parent +
                ", menuOrder=" + menuOrder +
                ", commentStatus='" + commentStatus + '\'' +
                ", pingStatus='" + pingStatus + '\'' +
                ", template='" + template + '\'' +
                ", meta=" + meta +
                ", yoastHead='" + yoastHead + '\'' +
                ", links=" + links +
                '}';
    }

    public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDateGmt() {
            return dateGmt;
        }

        public void setDateGmt(String dateGmt) {
            this.dateGmt = dateGmt;
        }

        public Guid getGuid() {
            return guid;
        }

        public void setGuid(Guid guid) {
            this.guid = guid;
        }

        public String getModified() {
            return modified;
        }

        public void setModified(String modified) {
            this.modified = modified;
        }

        public String getModifiedGmt() {
            return modifiedGmt;
        }

        public void setModifiedGmt(String modifiedGmt) {
            this.modifiedGmt = modifiedGmt;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public Title getTitle() {
            return title;
        }

        public void setTitle(Title title) {
            this.title = title;
        }

        public Content getContent() {
            return content;
        }

        public void setContent(Content content) {
            this.content = content;
        }

        public Excerpt getExcerpt() {
            return excerpt;
        }

        public void setExcerpt(Excerpt excerpt) {
            this.excerpt = excerpt;
        }

        public Long getAuthor() {
            return author;
        }

        public void setAuthor(Long author) {
            this.author = author;
        }

        public Long getFeaturedMedia() {
            return featuredMedia;
        }

        public void setFeaturedMedia(Long featuredMedia) {
            this.featuredMedia = featuredMedia;
        }

        public Long getParent() {
            return parent;
        }

        public void setParent(Long parent) {
            this.parent = parent;
        }

        public Long getMenuOrder() {
            return menuOrder;
        }

        public void setMenuOrder(Long menuOrder) {
            this.menuOrder = menuOrder;
        }

        public String getCommentStatus() {
            return commentStatus;
        }

        public void setCommentStatus(String commentStatus) {
            this.commentStatus = commentStatus;
        }

        public String getPingStatus() {
            return pingStatus;
        }

        public void setPingStatus(String pingStatus) {
            this.pingStatus = pingStatus;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }

        public String getYoastHead() {
            return yoastHead;
        }

        public void setYoastHead(String yoastHead) {
            this.yoastHead = yoastHead;
        }

        public Links getLinks() {
            return links;
        }

        public void setLinks(Links links) {
            this.links = links;
        }



    public class About {

        @SerializedName("href")
        @Expose
        private String href;

        @Override
        public String toString() {
            return "About{" +
                    "href='" + href + '\'' +
                    '}';
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Author {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        @Override
        public String toString() {
            return "Author{" +
                    "embeddable=" + embeddable +
                    ", href='" + href + '\'' +
                    '}';
        }

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Collection {

        @SerializedName("href")
        @Expose
        private String href;

        @Override
        public String toString() {
            return "Collection{" +
                    "href='" + href + '\'' +
                    '}';
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Content {

        @SerializedName("rendered")
        @Expose
        private String rendered;
        @SerializedName("protected")
        @Expose
        private Boolean _protected;

        @Override
        public String toString() {
            return "Content{" +
                    "rendered='" + rendered + '\'' +
                    ", _protected=" + _protected +
                    '}';
        }

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public Boolean getProtected() {
            return _protected;
        }

        public void setProtected(Boolean _protected) {
            this._protected = _protected;
        }

    }

    public class Cury {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("templated")
        @Expose
        private Boolean templated;

        @Override
        public String toString() {
            return "Cury{" +
                    "name='" + name + '\'' +
                    ", href='" + href + '\'' +
                    ", templated=" + templated +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public Boolean getTemplated() {
            return templated;
        }

        public void setTemplated(Boolean templated) {
            this.templated = templated;
        }

    }

    public class Excerpt {

        @SerializedName("rendered")
        @Expose
        private String rendered;
        @SerializedName("protected")
        @Expose
        private Boolean _protected;

        @Override
        public String toString() {
            return "Excerpt{" +
                    "rendered='" + rendered + '\'' +
                    ", _protected=" + _protected +
                    '}';
        }

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public Boolean getProtected() {
            return _protected;
        }

        public void setProtected(Boolean _protected) {
            this._protected = _protected;
        }

    }

    public class Guid {

        @SerializedName("rendered")
        @Expose
        private String rendered;


        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }

    public class Links {

        @SerializedName("self")
        @Expose
        private List<Self> self = null;
        @SerializedName("collection")
        @Expose
        private List<Collection> collection = null;
        @SerializedName("about")
        @Expose
        private List<About> about = null;
        @SerializedName("author")
        @Expose
        private List<Author> author = null;
        @SerializedName("replies")
        @Expose
        private List<Reply> replies = null;
        @SerializedName("version-history")
        @Expose
        private List<VersionHistory> versionHistory = null;
        @SerializedName("predecessor-version")
        @Expose
        private List<PredecessorVersion> predecessorVersion = null;
        @SerializedName("wp:attachment")
        @Expose
        private List<WpAttachment> wpAttachment = null;
        @SerializedName("curies")
        @Expose
        private List<Cury> curies = null;

        public List<Self> getSelf() {
            return self;
        }

        public void setSelf(List<Self> self) {
            this.self = self;
        }

        public List<Collection> getCollection() {
            return collection;
        }

        public void setCollection(List<Collection> collection) {
            this.collection = collection;
        }

        public List<About> getAbout() {
            return about;
        }

        public void setAbout(List<About> about) {
            this.about = about;
        }

        public List<Author> getAuthor() {
            return author;
        }

        public void setAuthor(List<Author> author) {
            this.author = author;
        }

        public List<Reply> getReplies() {
            return replies;
        }

        public void setReplies(List<Reply> replies) {
            this.replies = replies;
        }

        public List<VersionHistory> getVersionHistory() {
            return versionHistory;
        }

        public void setVersionHistory(List<VersionHistory> versionHistory) {
            this.versionHistory = versionHistory;
        }

        public List<PredecessorVersion> getPredecessorVersion() {
            return predecessorVersion;
        }

        public void setPredecessorVersion(List<PredecessorVersion> predecessorVersion) {
            this.predecessorVersion = predecessorVersion;
        }

        public List<WpAttachment> getWpAttachment() {
            return wpAttachment;
        }

        public void setWpAttachment(List<WpAttachment> wpAttachment) {
            this.wpAttachment = wpAttachment;
        }

        public List<Cury> getCuries() {
            return curies;
        }

        public void setCuries(List<Cury> curies) {
            this.curies = curies;
        }

    }

    public class Meta {

        @SerializedName("ngg_post_thumbnail")
        @Expose
        private Long nggPostThumbnail;

        public Long getNggPostThumbnail() {
            return nggPostThumbnail;
        }

        public void setNggPostThumbnail(Long nggPostThumbnail) {
            this.nggPostThumbnail = nggPostThumbnail;
        }

    }

    public class PredecessorVersion {

        @SerializedName("id")
        @Expose
        private Long id;
        @SerializedName("href")
        @Expose
        private String href;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Reply {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }
    public class Self {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Title {

        @SerializedName("rendered")
        @Expose
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }

    public class VersionHistory {

        @SerializedName("count")
        @Expose
        private Long count;
        @SerializedName("href")
        @Expose
        private String href;

        public Long getCount() {
            return count;
        }

        public void setCount(Long count) {
            this.count = count;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class WpAttachment {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }
}
