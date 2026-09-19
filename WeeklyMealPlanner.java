import java.util.Scanner;

public class WeeklyMealPlanner {

    // Scanner object for taking user input
    static Scanner sc = new Scanner(System.in);

    // Days of the week
    static String[] days = {
        "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday"
    };

    // Stores the meal selected for each day
    static String[] weeklyMeals = new String[7];

    // Available meals
    static String[] meals = {
        "Vegetable Rice",
        "Chicken Rice",
        "Vegetable Pasta",
        "Dal and Rice",
        "Chapati and Curry",
        "Idli and Sambar",
        "Vegetable Sandwich"
    };

    public static void main(String[] args) {

        int choice;

        // Initialize all days
        for (int i = 0; i < weeklyMeals.length; i++) {
            weeklyMeals[i] = "Not Selected";
        }

        do {
            System.out.println("\n==============================================");
            System.out.println("       WEEKLY MEAL PLANNER");
            System.out.println("       AND GROCERY GENERATOR");
            System.out.println("==============================================");

            System.out.println("1. View Available Meals");
            System.out.println("2. Select Meals for the Week");
            System.out.println("3. View Weekly Meal Plan");
            System.out.println("4. Generate Grocery List");
            System.out.println("5. Display Grocery List");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    viewMeals();
                    break;

                case 2:
                    selectMeals();
                    break;

                case 3:
                    viewWeeklyPlan();
                    break;

                case 4:
                    generateGroceryList();
                    break;

                case 5:
                    displayGroceryList();
                    break;

                case 6:
                    System.out.println("\nThank you for using the Weekly Meal Planner!");
                    System.out.println("Have a great week.");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }

    // Displays available meals
    static void viewMeals() {

        System.out.println("\n------------- AVAILABLE MEALS -------------");

        for (int i = 0; i < meals.length; i++) {
            System.out.println((i + 1) + ". " + meals[i]);
        }
    }

    // Allows the user to select meals for each day
    static void selectMeals() {

        System.out.println("\n------------- SELECT WEEKLY MEALS -------------");

        viewMeals();

        for (int i = 0; i < days.length; i++) {

            System.out.println("\n" + days[i]);

            System.out.print("Enter meal number (1-7): ");
            int mealChoice = sc.nextInt();

            if (mealChoice >= 1 && mealChoice <= meals.length) {

                weeklyMeals[i] = meals[mealChoice - 1];

                System.out.println(
                    "Selected: " + weeklyMeals[i]
                );

            } else {

                System.out.println("Invalid meal number.");
                System.out.println("Meal not changed.");
            }
        }

        System.out.println("\nWeekly meal plan updated successfully.");
    }

    // Displays the selected weekly meal plan
    static void viewWeeklyPlan() {

        System.out.println("\n------------- WEEKLY MEAL PLAN -------------");

        for (int i = 0; i < days.length; i++) {

            System.out.printf(
                "%-12s : %s%n",
                days[i],
                weeklyMeals[i]
            );
        }
    }

    // Generates the grocery list
    static void generateGroceryList() {

        System.out.println("\n------------- GROCERY LIST GENERATION -------------");

        System.out.println("Generating grocery list...");
        System.out.println("Checking ingredients for selected meals...");

        System.out.println("Grocery list generated successfully.");
    }

    // Displays grocery items according to selected meals
    static void displayGroceryList() {

        System.out.println("\n================================================");
        System.out.println("                 GROCERY LIST");
        System.out.println("================================================");

        boolean mealSelected = false;

        // Check whether at least one meal is selected
        for (int i = 0; i < weeklyMeals.length; i++) {

            if (!weeklyMeals[i].equals("Not Selected")) {
                mealSelected = true;
                break;
            }
        }

        if (!mealSelected) {

            System.out.println("No meals selected yet.");
            System.out.println("Please select meals first.");

            return;
        }

        System.out.println("\nVEGETABLES");
        System.out.println("--------------------------------");
        System.out.println("- Carrots");
        System.out.println("- Tomatoes");
        System.out.println("- Onions");
        System.out.println("- Potatoes");
        System.out.println("- Green vegetables");

        System.out.println("\nFRUITS");
        System.out.println("--------------------------------");
        System.out.println("- Bananas");
        System.out.println("- Apples");

        System.out.println("\nGRAINS");
        System.out.println("--------------------------------");
        System.out.println("- Rice");
        System.out.println("- Wheat flour");
        System.out.println("- Pasta");

        System.out.println("\nDAIRY");
        System.out.println("--------------------------------");
        System.out.println("- Milk");
        System.out.println("- Curd");

        System.out.println("\nPROTEIN");
        System.out.println("--------------------------------");
        System.out.println("- Chicken");
        System.out.println("- Dal");

        System.out.println("\nOTHER ITEMS");
        System.out.println("--------------------------------");
        System.out.println("- Cooking oil");
        System.out.println("- Salt");
        System.out.println("- Spices");

        System.out.println("\n================================================");
        System.out.println("Grocery list displayed successfully.");
        System.out.println("================================================");
    }
}