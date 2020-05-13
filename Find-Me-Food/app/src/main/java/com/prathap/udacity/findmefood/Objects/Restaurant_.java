
package com.prathap.udacity.findmefood.Objects;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "restaurant")
public class Restaurant_ implements Parcelable {

    @Ignore
    @SerializedName("R")
    @Expose
    private R r;
    @Ignore
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @PrimaryKey
    @NonNull
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @Ignore
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("switch_to_order_menu")
    @Expose
    private Integer switchToOrderMenu;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @Ignore
    @SerializedName("offers")
    @Expose
    private List<Object> offers = null;
    @SerializedName("opentable_support")
    @Expose
    private Integer opentableSupport;
    @SerializedName("is_zomato_book_res")
    @Expose
    private Integer isZomatoBookRes;
    @SerializedName("mezzo_provider")
    @Expose
    private String mezzoProvider;
    @SerializedName("is_book_form_web_view")
    @Expose
    private Integer isBookFormWebView;
    @SerializedName("book_form_web_view_url")
    @Expose
    private String bookFormWebViewUrl;
    @SerializedName("book_again_url")
    @Expose
    private String bookAgainUrl;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @Ignore
    @SerializedName("user_rating")
    @Expose
    private UserRating userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("include_bogo_offers")
    @Expose
    private Boolean includeBogoOffers;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("is_table_reservation_supported")
    @Expose
    private Integer isTableReservationSupported;
    @SerializedName("has_table_booking")
    @Expose
    private Integer hasTableBooking;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @Ignore
    @SerializedName("establishment_types")
    @Expose
    private List<Object> establishmentTypes = null;

    // Variables for DB
    private boolean isBookmarked = false;
    private String restaurantRating;
    private String restaurantVotes;
    private String restaurantAddress;
    private String latLng;

    public Restaurant_(
            String id,
            String name,
            String url,
            Integer switchToOrderMenu,
            String cuisines,
            Integer averageCostForTwo,
            Integer priceRange,
            String currency,
            Integer opentableSupport,
            Integer isZomatoBookRes,
            String mezzoProvider,
            Integer isBookFormWebView,
            String bookFormWebViewUrl,
            String bookAgainUrl,
            String thumb,
            String photosUrl,
            String menuUrl,
            String featuredImage,
            Integer hasOnlineDelivery,
            Integer isDeliveringNow,
            Boolean includeBogoOffers,
            String deeplink,
            Integer isTableReservationSupported,
            Integer hasTableBooking,
            String eventsUrl,
            Boolean isBookmarked,
            String restaurantRating,
            String restaurantVotes,
            String restaurantAddress,
            String latLng
    ) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.switchToOrderMenu = switchToOrderMenu;
        this.cuisines = cuisines;
        this.averageCostForTwo = averageCostForTwo;
        this.priceRange = priceRange;
        this.currency = currency;
        this.opentableSupport = opentableSupport;
        this.isZomatoBookRes = isZomatoBookRes;
        this.mezzoProvider = mezzoProvider;
        this.isBookFormWebView = isBookFormWebView;
        this.bookFormWebViewUrl = bookFormWebViewUrl;
        this.bookAgainUrl = bookAgainUrl;
        this.thumb = thumb;
        this.photosUrl = photosUrl;
        this.menuUrl = menuUrl;
        this.featuredImage = featuredImage;
        this.hasOnlineDelivery = hasOnlineDelivery;
        this.isDeliveringNow = isDeliveringNow;
        this.includeBogoOffers = includeBogoOffers;
        this.deeplink = deeplink;
        this.isTableReservationSupported = isTableReservationSupported;
        this.hasTableBooking = hasTableBooking;
        this.eventsUrl = eventsUrl;
        this.isBookmarked = isBookmarked;
        this.restaurantRating = restaurantRating;
        this.restaurantVotes = restaurantVotes;
        this.restaurantAddress = restaurantAddress;
        this.latLng = latLng;
    }

    protected Restaurant_(Parcel in) {
        apikey = in.readString();
        id = in.readString();
        name = in.readString();
        url = in.readString();
        location = in.readParcelable(Location.class.getClassLoader());
        if (in.readByte() == 0) {
            switchToOrderMenu = null;
        } else {
            switchToOrderMenu = in.readInt();
        }
        cuisines = in.readString();
        if (in.readByte() == 0) {
            averageCostForTwo = null;
        } else {
            averageCostForTwo = in.readInt();
        }
        if (in.readByte() == 0) {
            priceRange = null;
        } else {
            priceRange = in.readInt();
        }
        currency = in.readString();
        if (in.readByte() == 0) {
            opentableSupport = null;
        } else {
            opentableSupport = in.readInt();
        }
        if (in.readByte() == 0) {
            isZomatoBookRes = null;
        } else {
            isZomatoBookRes = in.readInt();
        }
        mezzoProvider = in.readString();
        if (in.readByte() == 0) {
            isBookFormWebView = null;
        } else {
            isBookFormWebView = in.readInt();
        }
        bookFormWebViewUrl = in.readString();
        bookAgainUrl = in.readString();
        thumb = in.readString();
        userRating = in.readParcelable(UserRating.class.getClassLoader());
        photosUrl = in.readString();
        menuUrl = in.readString();
        featuredImage = in.readString();
        if (in.readByte() == 0) {
            hasOnlineDelivery = null;
        } else {
            hasOnlineDelivery = in.readInt();
        }
        if (in.readByte() == 0) {
            isDeliveringNow = null;
        } else {
            isDeliveringNow = in.readInt();
        }
        byte tmpIncludeBogoOffers = in.readByte();
        includeBogoOffers = tmpIncludeBogoOffers == 0 ? null : tmpIncludeBogoOffers == 1;
        deeplink = in.readString();
        if (in.readByte() == 0) {
            isTableReservationSupported = null;
        } else {
            isTableReservationSupported = in.readInt();
        }
        if (in.readByte() == 0) {
            hasTableBooking = null;
        } else {
            hasTableBooking = in.readInt();
        }
        eventsUrl = in.readString();
        isBookmarked = in.readByte() != 0;
        restaurantRating = in.readString();
        restaurantVotes = in.readString();
        restaurantAddress = in.readString();
        latLng = in.readString();
    }

    public static final Creator<Restaurant_> CREATOR = new Creator<Restaurant_>() {
        @Override
        public Restaurant_ createFromParcel(Parcel in) {
            return new Restaurant_(in);
        }

        @Override
        public Restaurant_[] newArray(int size) {
            return new Restaurant_[size];
        }
    };

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getSwitchToOrderMenu() {
        return switchToOrderMenu;
    }

    public void setSwitchToOrderMenu(Integer switchToOrderMenu) {
        this.switchToOrderMenu = switchToOrderMenu;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    public Integer getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Object> getOffers() {
        return offers;
    }

    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    public Integer getOpentableSupport() {
        return opentableSupport;
    }

    public void setOpentableSupport(Integer opentableSupport) {
        this.opentableSupport = opentableSupport;
    }

    public Integer getIsZomatoBookRes() {
        return isZomatoBookRes;
    }

    public void setIsZomatoBookRes(Integer isZomatoBookRes) {
        this.isZomatoBookRes = isZomatoBookRes;
    }

    public String getMezzoProvider() {
        return mezzoProvider;
    }

    public void setMezzoProvider(String mezzoProvider) {
        this.mezzoProvider = mezzoProvider;
    }

    public Integer getIsBookFormWebView() {
        return isBookFormWebView;
    }

    public void setIsBookFormWebView(Integer isBookFormWebView) {
        this.isBookFormWebView = isBookFormWebView;
    }

    public String getBookFormWebViewUrl() {
        return bookFormWebViewUrl;
    }

    public void setBookFormWebViewUrl(String bookFormWebViewUrl) {
        this.bookFormWebViewUrl = bookFormWebViewUrl;
    }

    public String getBookAgainUrl() {
        return bookAgainUrl;
    }

    public void setBookAgainUrl(String bookAgainUrl) {
        this.bookAgainUrl = bookAgainUrl;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public UserRating getUserRating() {
        return userRating;
    }

    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

    public String getPhotosUrl() {
        return photosUrl;
    }

    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    public Boolean getIncludeBogoOffers() {
        return includeBogoOffers;
    }

    public void setIncludeBogoOffers(Boolean includeBogoOffers) {
        this.includeBogoOffers = includeBogoOffers;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public Integer getIsTableReservationSupported() {
        return isTableReservationSupported;
    }

    public void setIsTableReservationSupported(Integer isTableReservationSupported) {
        this.isTableReservationSupported = isTableReservationSupported;
    }

    public Integer getHasTableBooking() {
        return hasTableBooking;
    }

    public void setHasTableBooking(Integer hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public List<Object> getEstablishmentTypes() {
        return establishmentTypes;
    }

    public void setEstablishmentTypes(List<Object> establishmentTypes) {
        this.establishmentTypes = establishmentTypes;
    }

    public Boolean getIsBookmarked() { return isBookmarked; }

    public void setIsBookmarked(Boolean isBookmarked) {
        this.isBookmarked = isBookmarked;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(apikey);
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(url);
        dest.writeParcelable(location, flags);
        if (switchToOrderMenu == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(switchToOrderMenu);
        }
        dest.writeString(cuisines);
        if (averageCostForTwo == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(averageCostForTwo);
        }
        if (priceRange == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(priceRange);
        }
        dest.writeString(currency);
        if (opentableSupport == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(opentableSupport);
        }
        if (isZomatoBookRes == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(isZomatoBookRes);
        }
        dest.writeString(mezzoProvider);
        if (isBookFormWebView == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(isBookFormWebView);
        }
        dest.writeString(bookFormWebViewUrl);
        dest.writeString(bookAgainUrl);
        dest.writeString(thumb);
        dest.writeParcelable(userRating, flags);
        dest.writeString(photosUrl);
        dest.writeString(menuUrl);
        dest.writeString(featuredImage);
        if (hasOnlineDelivery == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(hasOnlineDelivery);
        }
        if (isDeliveringNow == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(isDeliveringNow);
        }
        dest.writeByte((byte) (includeBogoOffers == null ? 0 : includeBogoOffers ? 1 : 2));
        dest.writeString(deeplink);
        if (isTableReservationSupported == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(isTableReservationSupported);
        }
        if (hasTableBooking == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(hasTableBooking);
        }
        dest.writeString(eventsUrl);
        dest.writeByte((byte) (isBookmarked ? 1 : 0));
        dest.writeString(restaurantRating);
        dest.writeString(restaurantVotes);
        dest.writeString(restaurantAddress);
        dest.writeString(latLng);
    }

    public String getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(String restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public String getRestaurantVotes() {
        return restaurantVotes;
    }

    public void setRestaurantVotes(String restaurantVotes) {
        this.restaurantVotes = restaurantVotes;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getLatLng() {
        return latLng;
    }

    public void setLatLng(String latLng) {
        this.latLng = latLng;
    }
}
