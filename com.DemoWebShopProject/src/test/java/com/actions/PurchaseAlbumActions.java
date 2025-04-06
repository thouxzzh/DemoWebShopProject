package com.actions;

import com.pages.PurchaseAlbumPage;
import com.utils.HelperClass;

public class PurchaseAlbumActions {

    PurchaseAlbumPage purchaseAlbumPage;

    public PurchaseAlbumActions() {
        this.purchaseAlbumPage = new PurchaseAlbumPage(HelperClass.getDriver());
    }

    public void purchaseAlbum(String albumName) {
        purchaseAlbumPage.clickDigitalDownloads();
        purchaseAlbumPage.addAlbumToCart(albumName);
        purchaseAlbumPage.clickShoppingCart();
    }

    public boolean verifyProductInCart(String albumName) {
        return purchaseAlbumPage.isProductInCart(albumName);
    }

    public void logout() {
        purchaseAlbumPage.clickLogout();
    }
}
