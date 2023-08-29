package interfaces;

import entities.Page;

public interface InternetBrowser {

    String displayPage ();

    String addNewPage (String url);

    String updatePage (Page page, String url);

    String closePage (String url);

    String fecthWebPage (String url);

}
