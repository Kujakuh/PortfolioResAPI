function openPage(pageUrl, isNewWindow = true){
    if(isNewWindow) window.open(pageUrl);
    else window.open(pageUrl, "_self")
}