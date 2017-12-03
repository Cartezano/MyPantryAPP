package cl.mypantry.Models;

import java.util.Date;

public class Pantry {

    private int id;
    private int user_id;
    private int product_id;
    private Date expiration_date;
    private int quality;

    public Pantry() {
        this(0, 0, 0, new Date(0000, 00, 00), 0);
    }

    public Pantry(int user_id) {
        this(user_id, 0, 0, new Date(0000, 00, 00), 0);
    }

    public Pantry(int user_id, int product_id) {
        this(user_id, product_id, 0, new Date(0000, 00, 00), 0);
    }

    public Pantry(int user_id, int product_id, int quality) {
        this(user_id, product_id, quality, new Date(0000, 00, 00), 0);
    }

    public Pantry(int user_id, int product_id, int quality, Date expiration_date) {
        this(user_id, product_id, quality, expiration_date, 0);
    }

    public Pantry(int user_id, int product_id, int quality, Date expiration_date, int id) {
        this.id = id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.quality = quality;
        this.expiration_date = expiration_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public int getProductId() {
        return product_id;
    }

    public void setProductId(int product_id) {
        this.product_id = product_id;
    }

    public Date getExpirationDate() {
        return expiration_date;
    }

    public void setExpirationDate(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
