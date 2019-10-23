
package com.example.myokhttpex;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GitResult implements Parcelable {

    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("node_id")
    @Expose
    private String nodeId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("repos_url")
    @Expose
    private String reposUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("hooks_url")
    @Expose
    private String hooksUrl;
    @SerializedName("issues_url")
    @Expose
    private String issuesUrl;
    @SerializedName("members_url")
    @Expose
    private String membersUrl;
    @SerializedName("public_members_url")
    @Expose
    private String publicMembersUrl;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("company")
    @Expose
    private Object company;
    @SerializedName("blog")
    @Expose
    private String blog;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("has_organization_projects")
    @Expose
    private Boolean hasOrganizationProjects;
    @SerializedName("has_repository_projects")
    @Expose
    private Boolean hasRepositoryProjects;
    @SerializedName("public_repos")
    @Expose
    private Integer publicRepos;
    @SerializedName("public_gists")
    @Expose
    private Integer publicGists;
    @SerializedName("followers")
    @Expose
    private Integer followers;
    @SerializedName("following")
    @Expose
    private Integer following;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("type")
    @Expose
    private String type;

    protected GitResult(Parcel in) {
        login = in.readString();
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readInt();
        }
        nodeId = in.readString();
        url = in.readString();
        reposUrl = in.readString();
        eventsUrl = in.readString();
        hooksUrl = in.readString();
        issuesUrl = in.readString();
        membersUrl = in.readString();
        publicMembersUrl = in.readString();
        avatarUrl = in.readString();
        description = in.readString();
        blog = in.readString();
        byte tmpIsVerified = in.readByte();
        isVerified = tmpIsVerified == 0 ? null : tmpIsVerified == 1;
        byte tmpHasOrganizationProjects = in.readByte();
        hasOrganizationProjects = tmpHasOrganizationProjects == 0 ? null : tmpHasOrganizationProjects == 1;
        byte tmpHasRepositoryProjects = in.readByte();
        hasRepositoryProjects = tmpHasRepositoryProjects == 0 ? null : tmpHasRepositoryProjects == 1;
        if (in.readByte() == 0) {
            publicRepos = null;
        } else {
            publicRepos = in.readInt();
        }
        if (in.readByte() == 0) {
            publicGists = null;
        } else {
            publicGists = in.readInt();
        }
        if (in.readByte() == 0) {
            followers = null;
        } else {
            followers = in.readInt();
        }
        if (in.readByte() == 0) {
            following = null;
        } else {
            following = in.readInt();
        }
        htmlUrl = in.readString();
        createdAt = in.readString();
        updatedAt = in.readString();
        type = in.readString();
    }

    public static final Creator<GitResult> CREATOR = new Creator<GitResult>() {
        @Override
        public GitResult createFromParcel(Parcel in) {
            return new GitResult(in);
        }

        @Override
        public GitResult[] newArray(int size) {
            return new GitResult[size];
        }
    };

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public String getPublicMembersUrl() {
        return publicMembersUrl;
    }

    public void setPublicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public Boolean getHasOrganizationProjects() {
        return hasOrganizationProjects;
    }

    public void setHasOrganizationProjects(Boolean hasOrganizationProjects) {
        this.hasOrganizationProjects = hasOrganizationProjects;
    }

    public Boolean getHasRepositoryProjects() {
        return hasRepositoryProjects;
    }

    public void setHasRepositoryProjects(Boolean hasRepositoryProjects) {
        this.hasRepositoryProjects = hasRepositoryProjects;
    }

    public Integer getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    public Integer getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(login);
        if (id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(id);
        }
        parcel.writeString(nodeId);
        parcel.writeString(url);
        parcel.writeString(reposUrl);
        parcel.writeString(eventsUrl);
        parcel.writeString(hooksUrl);
        parcel.writeString(issuesUrl);
        parcel.writeString(membersUrl);
        parcel.writeString(publicMembersUrl);
        parcel.writeString(avatarUrl);
        parcel.writeString(description);
        parcel.writeString(blog);
        parcel.writeByte((byte) (isVerified == null ? 0 : isVerified ? 1 : 2));
        parcel.writeByte((byte) (hasOrganizationProjects == null ? 0 : hasOrganizationProjects ? 1 : 2));
        parcel.writeByte((byte) (hasRepositoryProjects == null ? 0 : hasRepositoryProjects ? 1 : 2));
        if (publicRepos == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(publicRepos);
        }
        if (publicGists == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(publicGists);
        }
        if (followers == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(followers);
        }
        if (following == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(following);
        }
        parcel.writeString(htmlUrl);
        parcel.writeString(createdAt);
        parcel.writeString(updatedAt);
        parcel.writeString(type);
    }
}
