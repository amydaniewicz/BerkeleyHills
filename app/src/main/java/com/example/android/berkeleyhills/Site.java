package com.example.android.berkeleyhills;

public class Site {
    private String mSiteName;
    private String mSiteDescription;
    private int mSiteImageResourceId = NO_IMAGE_PROVIDED;
    private int mSiteDetailImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Constructor */
    public Site(String siteName, String siteDescription, int siteImageResourceId, int siteDetailImageResourceId) {
        mSiteName = siteName;
        mSiteDescription = siteDescription;
        mSiteImageResourceId = siteImageResourceId;
        mSiteDetailImageResourceId = siteDetailImageResourceId;
    }

    public String getSiteName() {
        return mSiteName;
    }

    public String getSiteDescription() {
        return mSiteDescription;
    }

    public int getSiteImageResourceId() { return mSiteImageResourceId; }

    public int getSiteDetailImageResourceId() { return mSiteDetailImageResourceId; }

    public boolean hasImage() { return mSiteImageResourceId != NO_IMAGE_PROVIDED; }

}
