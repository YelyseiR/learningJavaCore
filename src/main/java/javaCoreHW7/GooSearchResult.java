package main.java.javaCoreHW7;

class GooSearchResult {
    private String url;

    public String getUrl() {
        return url;
    }

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String parseDomain() {
        String domainName = url.replaceAll("http(s)?://|www\\.|/.*", "");
        return domainName;
    }
}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}
