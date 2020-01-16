package restaurant;

public class MenuItem {
    private final int menuId;
    private final String description;
    private final double price;
    private final MenuCategory category;
    private boolean isNew;

    public MenuItem(int menuId, String description, double price, MenuCategory category, boolean isNew) {
        this.menuId = menuId;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public int getMenuId() {
        return menuId;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public MenuCategory getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }
}
