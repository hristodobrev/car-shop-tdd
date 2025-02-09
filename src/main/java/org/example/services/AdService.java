package org.example.services;

import org.example.models.Ad;
import org.example.repositories.AdRepository;

public class AdService {
    private final AdRepository adRepository = new AdRepository();
    private final CarService carService = new CarService();
    private final UserService userService = new UserService();

    public String add(String userId, String carId, String title, String description, String price) {
        Ad ad = new Ad();

        ad.setUser(this.userService.get(Integer.parseInt(userId)));

        try {
            ad.setCar(this.carService.get(Integer.parseInt(carId)));
        } catch (NumberFormatException e) {
            return "Car id must be a valid number!";
        } catch (IndexOutOfBoundsException e) {
            return "Car does not exist!";
        }

        if (title.isBlank()) {
            return "Title is required!";
        }

        ad.setTitle(title);

        if (price.isBlank()) {
            return "Price is required!";
        } else {
            try {
                ad.setPrice(Double.parseDouble(price));
            } catch (NumberFormatException e) {
                return "Price must be a valid number!";
            }
        }

        if (!description.isBlank()) {
            ad.setDescription(description);
        }

        this.adRepository.add(ad);

        return "Advert added successfully!";
    }
}
