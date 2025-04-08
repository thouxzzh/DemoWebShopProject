//
//package com.actions;
//
//import com.pages.WishlistPage;
//import com.utils.HelperClass;
//
//public class WishlistActions {
//
//    WishlistPage wishlistPage;
//
//    public WishlistActions() {
//        this.wishlistPage = new WishlistPage(HelperClass.getDriver());
//    }
//
//    public void navigateToDigitalDownloads() {
//        wishlistPage.clickDigitalDownloads();
//    }
//
////    public void addProductToWishlist(String product) {
////        if (product.equalsIgnoreCase("3rd Album")) {
////            wishlistPage.addAlbumToWishlist();
////        }
////    }
////    
//    public void addProductToWishlist(String product) {
//        if (product.equalsIgnoreCase("3rd Album")) {
//            wishlistPage.clickAlbum();               // open album details
//            wishlistPage.addAlbumToWishlist();       // click "Add to wishlist"
//        }
//    }
//
//
//    public void openWishlistPage() {
//        wishlistPage.goToWishlist();
//    }
//
//    public boolean isProductInWishlist(String productName) {
//        return wishlistPage.isProductInWishlist(productName);
//    }
//
////    public void logout() {
////        wishlistPage.logout();
////    }
//}



package com.actions;

import com.pages.WishlistPage;
import com.utils.HelperClass;

public class WishlistActions {

    WishlistPage wishlistPage;

    public WishlistActions() {
        this.wishlistPage = new WishlistPage(HelperClass.getDriver());
    }

    public void navigateToDigitalDownloads() {
        wishlistPage.clickDigitalDownloads();
    }

    public void addProductToWishlist(String product) {
        if (product.equalsIgnoreCase("3rd Album")) {
            wishlistPage.clickAlbum();               // open album details
            wishlistPage.addAlbumToWishlist();       // click "Add to wishlist"
        }
    }

    public void openWishlistPage() {
        wishlistPage.goToWishlist();
    }

    public boolean isProductInWishlist(String productName) {
        return wishlistPage.isProductInWishlist(productName);
    }

    public void clickEmailAFriend() {
        wishlistPage.clickEmailAFriend();
    }

    public void enterFriendEmail(String email) {
        wishlistPage.enterFriendEmail(email);
    }

    public void enterYourEmail(String email) {
        wishlistPage.enterYourEmail(email);
    }

    public void enterPersonalMessage(String msg) {
        wishlistPage.enterPersonalMessage(msg);
    }

    public void sendEmail() {
        wishlistPage.clickSendEmail();
    }
}

