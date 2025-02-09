package org.example.repositories;

import org.example.models.Ad;

import java.util.ArrayList;
import java.util.List;

public class AdRepository {
    private final ArrayList<Ad> ads = new ArrayList<>();

    public Ad get(int id) {
        return this.ads.get(id);
    }

    public List<Ad> getAll() {
        return this.ads;
    }

    public void add(Ad ad) {
        this.ads.add(ad);
    }
}
