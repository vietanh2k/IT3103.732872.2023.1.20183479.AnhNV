package AimsProject.hust.soict.dsai.aims;

import AimsProject.hust.soict.dsai.aims.cart.Cart;
import AimsProject.hust.soict.dsai.aims.media.Media;
import AimsProject.hust.soict.dsai.aims.playable.Playable;
import AimsProject.hust.soict.dsai.aims.store.Store;

import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        System.out.println("HoVaTen: Nguyen Viet Anh");
        System.out.println("MSSV: 20183479\n\n\n\n");
        Cart anOrder = new Cart();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
//                    seeCurrentCart();
                    break;
                case 0:
                    System.out.println("Exiting AIMS. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void viewStore() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media’s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
//                    seeCurrentCart();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void seeMediaDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();

        Media media = store.search(title);
        if (media != null) {
            System.out.println(media.toString());

            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    cart.addMedia(media);
                    System.out.println("Added to cart.");
                    break;
                case 2:
                    if (media instanceof Playable) {
                        ((Playable) media).play();
                    } else {
                        System.out.println("This media is not playable.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void addMediaToCart() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of the media in store: ");
        String title = scanner.nextLine();

        Media media = store.search(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Added to cart.");
        } else {
            System.out.println("Media not found in store.");
        }
    }

    public static void playMedia() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();

        Media media = store.search(title);
        if (media != null && media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Playable media not found.");
        }
    }

    public static void updateStore() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media to store");
            System.out.println("2. Remove a media from store");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
//                    addMediaToStore();
                    break;
                case 2:
//                    removeMediaFromStore();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
