package com.example.arnold.myapp.model;

public class Food {
    private int id;
    private String image;
    private String name;
    private String description;
    private String category;
    private String ingredients;
    private String calories;
    private float rating;

    public Food(){}

    public Food(String image, String name, String description, String category, String ingredients, String calories, float rating) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.category = category;
        this.ingredients = ingredients;
        this.calories = calories;
        this.rating = rating;
    }

    public int getId() { return id;    }

    public String getImage() { return image;    }

    public void setImage(String image) { this.image = image;    }

    public String getName() { return name;    }

    public void setName(String name) { this.name = name;    }

    public String getDescription() { return description;    }

    public void setDescription(String description) { this.description = description;    }

    public String getCategory() { return category;    }

    public void setCategory(String category) { this.category = category;    }

    public String getIngredients() { return ingredients;    }

    public void setIngredients(String ingredients) { this.ingredients = ingredients;    }

    public String getCalories() { return calories;    }

    public void setCalories(String calories) { this.calories = calories;    }

    public float getRating() { return rating;    }

    public void setRating(float rating) { this.rating = rating;    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", calories=" + calories +
                ", rating=" + rating +
                '}';
    }
}
