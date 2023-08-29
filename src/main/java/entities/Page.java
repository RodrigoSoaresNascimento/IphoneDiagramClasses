package entities;

import java.util.List;

public class Page {
    private String url;
    private Integer title;
    private String content;
    private List<String> asserts;
    private List<String> links;

    public Page(String url, Integer title, String content, List<String> asserts, List<String> links) {
        this.url = url;
        this.title = title;
        this.content = content;
        this.asserts = asserts;
        this.links = links;
    }

    public Page() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getAsserts() {
        return asserts;
    }

    public void setAsserts(List<String> asserts) {
        this.asserts = asserts;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "Page{" +
                "url='" + url + '\'' +
                ", title=" + title +
                ", content='" + content + '\'' +
                ", asserts=" + asserts +
                ", links=" + links +
                '}';
    }
}
