/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//package com.mycompany.fashionshop;

import java.util.*;

/**
 *
 * @author supun
 */
public class FashionShop {
	
	public static Scanner sc = new Scanner(System.in);
			
	static int id = 8;
    static String[] idArr = {"ODR#00001", "ODR#00002", "ODR#00003", "ODR#00004", "ODR#00005", "ODR#00006", "ODR#00007", "ODR#00008"};
    static String[] phoneArr = {"0776198410", "0703859852", "0769854321", "0776198410", "0703859852", "0775544336", "0703859852", "0712002200"};
    static int[] qtyArr = {3, 4, 1, 3, 6, 2, 1, 3};
    static String[] statusArr = {"Processing", "Delivering", "Delivering", "Processing", "Delivered", "Delivering", "Processing", "Delivered"};
    static double[] amountArr = {1800, 4400, 1200, 2700, 5400, 1600, 1200, 2700};
    static String[] sizeArr = {"XS", "XL", "XXL", "M", "M", "S", "XXL", "M"};
    static final String[] TsizeArr = {"XS", "S", "M", "L", "XL", "XXL"};
    static final String[] OrderStatusArr = {"Processing", "Delivering", "Delivered"};
 
    /*static int id = 0;
    static String[] idArr = new String [0];
    static String[] phoneArr = new String [0];
    static int[] qtyArr = new int [0];
    static String[] statusArr = new String [0];
    static double[] amountArr = new double [0];
    static String[] sizeArr = new String [0];
    static final String[] TsizeArr = {"XS", "S", "M", "L", "XL", "XXL"};
    static final String[] OrderStatusArr = {"Processing", "Delivering", "Delivered"}; */

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
// Handle any exceptions.
        }
    }

    public static String OrderStatus(int x) {

        switch (x) {
            case 0 -> {
                return OrderStatusArr[0];
            }
            case 1 -> {
                return OrderStatusArr[1];
            }
            case 2 -> {
                return OrderStatusArr[2];
            }
            default -> {
                System.out.println("Order Status error ");
                throw new AssertionError();
            }
        }
    }

    public static void clearLine(int x) {

        // Move the cursor up five lines
        System.out.print("\033[" + x + "A");
        // Clear the lines
        System.out.print("\033[0J");
    }

    public static void declementArry() {
        // arry eke size eka adu krima 
        String[] idtemp = new String[idArr.length - 1];
        String[] phonetemp = new String[phoneArr.length - 1];
        int[] qtytemp = new int[qtyArr.length - 1];
        String[] sizeArrtemp = new String[sizeArr.length - 1];
        double[] amounttemp = new double[amountArr.length - 1];
        String[] sttemp = new String[statusArr.length - 1];

// klin thiyana data save krima 
        for (int i = 0; i < idArr.length - 1; i++) {
            idtemp[i] = idArr[i];
            phonetemp[i] = phoneArr[i];
            qtytemp[i] = qtyArr[i];
            amounttemp[i] = amountArr[i];
            sttemp[i] = statusArr[i];
            sizeArrtemp[i] = sizeArr[i];
        }

// tem array eke ewa real array ekt change krima address 
        idArr = idtemp;
        phoneArr = phonetemp;
        qtyArr = qtytemp;
        statusArr = sttemp;
        amountArr = amounttemp;
        sizeArr = sizeArrtemp;
    }

    public static void emplementArray() {
        // array eke length eka wdi krnna ekakin
        String[] idtemp = new String[idArr.length + 1];
        String[] phonetemp = new String[phoneArr.length + 1];
        int[] qtytemp = new int[qtyArr.length + 1];
        String[] sttemp = new String[statusArr.length + 1];
        double[] amounttemp = new double[amountArr.length + 1];
        String[] sizeArrtemp = new String[sizeArr.length + 1];

        // klin thiyana data save krima 
        for (int i = 0; i < idtemp.length - 1; i++) {
            idtemp[i] = idArr[i];

            phonetemp[i] = phoneArr[i];
            qtytemp[i] = qtyArr[i];
            amounttemp[i] = amountArr[i];
            sttemp[i] = statusArr[i];
            sizeArrtemp[i] = sizeArr[i];

        }
        // tem array eke ewa real array ekt change krima address 
        idArr = idtemp;
        phoneArr = phonetemp;
        qtyArr = qtytemp;
        statusArr = sttemp;
        amountArr = amounttemp;

        sizeArr = sizeArrtemp;

    }

    public static void Home() {
        clearConsole();
        System.out.println("""
                           \t /$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                          
                           \t| $$_____/                | $$      |__/                           /$$__  $$| $$                          
                           \t| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ 
                           \t| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$
                           \t| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$
                           \t| $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$
                           \t| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/
                           \t|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/ 
                           \t                                                                                                | $$      
                           \t                                                                                                | $$      
                           \t                                                                                                |__/      """);

        System.out.println("    -----------------------------------------------------------------------------------------------------------------\n");
        System.out.print("\t\t[1] Place Order");
        System.out.print("\t\t\t\t\t\t[2] Search Customer\n\n");
        System.out.print("\t\t[3] Search Order");
        System.out.print("\t\t\t\t\t[4] View Reports\n\n");
        System.out.print("\t\t[5] Change Order Status ");
        System.out.print("\t\t\t\t[6] Delete Order\n\n\n   ");

        while (true) {
            System.out.print("\t\tInput Option : ");
            char num = sc.next().charAt(0);
            switch (num) {
                case '1' -> placeOrder();
                case '2' -> SearchCustomer();
                case '3' -> SearchOrder();
                case '4' -> ViewReports();
                case '5' -> OrderStatus();
                case '6' -> DeleteOrder();
                default -> {
                    clearLine(1);
                    continue;                }
            }
        }
    }

    public static void placeOrder() {
        clearConsole();
        id++;
        System.out.println("""
                       \t  _____  _                   ____          _           
                       \t |  __ \\| |                 / __ \\        | |          
                       \t | |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __ 
                       \t |  ___/| |/ _` |/ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|
                       \t | |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |   
                       \t |_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|
                       \t _______________________________________________________ """);

        System.out.printf("\n\n\t%-40s%2s%4s%05d", "Enter Order ID", ": ", "ODR#", id);
        String contactNumber;
        String orderId = null;
        for (int i = 0; i < id; i++) {
            orderId = "ODR#" + String.format("%05d", id);
        }
        System.out.println("\n");
        L5:
        while (true) {
            System.out.printf("\t%-40s%2s", "Enter Customer Phone Number", ": ");
            contactNumber = sc.next();
            L1:
            while (true) {
                if (contactNumber.matches("^0\\d{9}$")) {

                    //check krnna one 
                    System.out.printf("\n\t%-40s%2s", "Enter T-Shirt Size (XS/S/M/L/XL/XXl)", ": ");
                    String size = sc.next().toUpperCase();
//---------------------------------------------------------------------------------------
                    // size array ekt one index anke check krnna , arry ek gththoth capital simpla dena widiyt ne save wenne 
                    if (size.equals("XS") || size.equals("S") || size.equals("M") || size.equals("L") || size.equals("XL") || size.equals("XL") || size.equals("XXL")) {

                        L2:
                        while (true) {
                            System.out.printf("\n\t%-40s%2s", "Enter QTY", ": ");
                            int Qty = sc.nextInt();
                            double amount;
                            if (Qty < 0) {
                                clearLine(2);
                                continue L2;
                            }
                            amount = switch (size) {
                                case "XS" -> 600 * Qty;
                                case "S" -> 800 * Qty;
                                case "M" -> 900 * Qty;
                                case "L" -> 1000 * Qty;
                                case "XL" -> 1100 * Qty;
                                default -> 1200 * Qty;
                            };

                            System.out.printf("\n\t%-40s%2s%.2f", "Amount", ": ", amount);
                            System.out.println("\n");
                            L4:
                            while (true) {
                                System.out.printf("\t%-40s%2s", "DO you want to place this order (Y/N) ?", ": ");
                                char op = sc.next().charAt(0);
                                switch (op) {
                                    case 'y', 'Y' -> {
                                        System.out.println("\n\t\tOrder Placed..!");
                                        // ---------------data save---------------
                                        emplementArray();
                                        idArr[idArr.length - 1] = orderId;
                                        phoneArr[idArr.length - 1] = contactNumber;
                                        sizeArr[idArr.length - 1] = size;
                                        qtyArr[idArr.length - 1] = Qty;
                                        amountArr[idArr.length - 1] = amount;
                                        statusArr[idArr.length - 1] = OrderStatus(0);
                                        System.out.println("\n");
                                        L7:
                                        while (true) {
                                            System.out.printf("\t%-40s%2s", "DO you want to place anther order(Y/N) ?", ": ");
                                            op = sc.next().charAt(0);
                                            switch (op) {
                                                case 'y', 'Y' -> placeOrder();
                                                case 'n', 'N' -> Home();
                                                default -> {
                                                    System.out.println("\t\tInvalid Input...");
                                                    clearLine(2);
                                                    continue L7;
                                                }
                                            }
                                        }
                                    }
                                    case 'n', 'N' -> {
                                        id--;
                                      
                                        L3:
                                        while (true) {
                                            System.out.printf("\n\t%-40s%2s", "DO you want to place anther order(Y/N) ?", ": ");
                                            op = sc.next().charAt(0);
                                            switch (op) {
                                                case 'y', 'Y' -> placeOrder();
                                                case 'n', 'N' -> Home();
                                                default -> {
                                                    clearLine(2);
                                                    continue L3;
                                                }
                                            }
                                        }
                                    }
                                    default -> {
                                        clearLine(1);
                                        continue L4;
                                    }
                                }
                            }
                        }
                    } else {
                        clearLine(2);
                        continue L1;
                    }

                } else {
                    System.out.println("\n\t\tInvalid Phone number..Try again");
                    L6:
                    while (true) {

                        System.out.printf("\n\t%-40s%2s", "Do you want to enter phone number again ? (Y/N )", ": ");
                        char op = sc.next().charAt(0);
                        switch (op) {
                            case 'y', 'Y' -> {
                                clearLine(5);
                                continue L5;
                            }
                            case 'n', 'N' -> {
								id--;
								Home();}
                            default -> {
								
                                clearLine(2);
                                continue L6;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void searchCustomerTable(int[] x) {
        int xsCount = 0;
        int sCount = 0;
        int mCount = 0;
        int lCount = 0;
        int xlCount = 0;
        int xxlCount = 0;
        for (int i : x) {
            switch (sizeArr[i]) {
                case "XS" ->
                    xsCount += qtyArr[i];
                case "S" ->
                    sCount += qtyArr[i];
                case "M" ->
                    mCount += qtyArr[i];
                case "L" ->
                    lCount += qtyArr[i];
                case "XL" ->
                    xlCount += qtyArr[i];
                case "XXL" ->
                    xxlCount += qtyArr[i];

            }

        }

        String[] temSizeArr = {"XS", "S", "M", "L", "XL", "XXL"};
        int[] qtyTable = {xsCount, sCount, mCount, lCount, xlCount, xxlCount};

        double[] amountTable = {xsCount * 600, sCount * 800, mCount * 900, lCount * 1000, xlCount * 1100, xxlCount * 1200};
        //-------------decending 
        for (int i = 0; i < qtyTable.length; i++) {
            for (int j = 0; j < qtyTable.length - 1; j++) {
                if (qtyTable[j] < qtyTable[j + 1]) {
                    int temqty = qtyTable[j + 1];
                    qtyTable[j + 1] = qtyTable[j];
                    qtyTable[j] = temqty;

                    double temamount = amountTable[j + 1];
                    amountTable[j + 1] = amountTable[j];
                    amountTable[j] = temamount;

                    String tempSize = temSizeArr[j + 1];
                    temSizeArr[j + 1] = temSizeArr[j];
                    temSizeArr[j] = tempSize;
                }
            }
        }

        //-------------------table------------
        System.out.println("  ");
        double total = 0;
        System.out.println("\t\t\t+----------+----------+---------------+");
        System.out.println("\t\t\t|   Size   |    QTY   |     Amount    |");
        System.out.println("\t\t\t+----------+----------+---------------+");
        for (int i = 0; i < qtyTable.length; i++) {
            System.out.println("\t\t\t|          |          |               |");
            System.out.printf("\t\t\t|  %-3s     |%8d  |%12.2f   |%n", temSizeArr[i], qtyTable[i], amountTable[i]);
            total += amountTable[i];
        }
        System.out.println("\t\t\t|          |          |               |");
        System.out.println("\t\t\t+----------+----------+---------------+");
        System.out.printf("\t\t\t|  Total Amount       |%12.2f   |%n", total);
        System.out.println("\t\t\t+---------------------+---------------+");

    }

    public static void SearchCustomer() {
        clearConsole();
        System.out.println("""
                       \t   _____                     _        _____          _                             
                       \t  / ____|                   | |      / ____|        | |                            
                       \t | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  
                       \t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| 
                       \t  ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    
                       \t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    
                              ___________________________________________________________________________________\n\n""");
        L0:
        while (true) {
            System.out.printf("\t%-30s%2s", "Enter Customer Phone Number", ": ");
            String number = sc.next();
            boolean found = false;
            int j = 0;
            int[] tem = new int[idArr.length];

            for (int i = 0; i < idArr.length; i++) {
                // thawa kalikawa array ekata save kirima
                if (phoneArr[i].equalsIgnoreCase(number)) {
                    j++;
                    tem[j - 1] = i;
                    found = true;
                }
            }
            if (!found) {
                System.out.println("\n");
                System.out.println("\t\tInvalit Input..");
                System.out.println("\n");
                L1:
                while (true) {
                    System.out.printf("\t%-40s%2s", "Do you want to search another customer report (Y/N) ?", ": ");
                    char op = sc.next().charAt(0);
                    switch (op) {
                        case 'y', 'Y' -> {
                            clearLine(7); // done
                            continue L0;
                        }
                        case 'n', 'N' ->
                            Home();
                        default -> {
                            clearLine(1); // done
                            continue L1;
                        }
                    }
                }
            }

            //declement array 
            int[] tem2 = new int[j];
            for (int i = 0; i < j; i++) {
                tem2[i] = tem[i];
            }
            //table eka hdila ena method eka   
            searchCustomerTable(tem2);
            L1:
            while (true) {
                System.out.printf("\n\n\t%-40s%2s", "Do you want to search another customer report (Y/N) ?", ": ");
                char op = sc.next().charAt(0);
                switch (op) {
                    case 'y', 'Y' -> {
                        clearLine(24); //done
                        continue L0;
                    }
                    case 'n', 'N' -> Home();
                    default -> {
                        clearLine(3);//done
                        continue L1;
                    }
                }
            }
        }

    }

    public static void SearchOrder() {
        clearConsole();
        System.out.println("""
                       \t   _____                     _        ____          _            
                       \t  / ____|                   | |      / __ \\        | |           
                       \t | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __  
                       \t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |  | | '__/ _` |/ _ \\ '__| 
                       \t  ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |    
                       \t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_|    
                               ________________________________________________________________   """);

        System.out.printf("\n\n\t%-20s%2s", "Enter Order ID", ": ");
        String inputId = sc.next();
        int x = 0;
        boolean found = false;

        for (String id : idArr) {
            if (id.equals(inputId)) {
                for (int i = 0; i < idArr.length; i++) {
                    if (id == idArr[i]) {
                        x = i;
                    }
                }
                found = true;
                break;
            }
        }

        if (found) {
            System.out.printf("\n\t%-20s%2s%10s", "Phone Number", ": ", phoneArr[x]);
            System.out.printf("\n\t%-20s%2s%-10s", "Size", ": ", sizeArr[x]);
            System.out.printf("\n\t%-20s%2s%-10d", "QTY", ": ", qtyArr[x]);
            System.out.printf("\n\t%-20s%2s%-10.2f", "Amount", ": ", amountArr[x]);
            System.out.printf("\n\t%-20s%2s%-10s", "Status", ": ", statusArr[x]);
            System.out.println("\n\n");

            L1:
            while (true) {

                System.out.printf("\t%-30s%2s", "Do you want to search another order (Y/N) ?", ": ");
                char op = sc.next().charAt(0);
                switch (op) {
                    case 'y', 'Y' -> SearchOrder();
                    case 'n', 'N' -> Home();
                    default -> {
                        clearLine(1);//done
                        continue L1;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("\n\t\tInvalid ID..");
            L2:
            while (true) {
                System.out.printf("\n\n\t%-30s%2s", "Do you want to search another order (Y/N) ?", ": ");
                char op = sc.next().charAt(0);
                switch (op) {
                    case 'y', 'Y' -> SearchOrder();
                    case 'n', 'N' -> Home();
                    default -> {
                        clearLine(3);//done
                        continue L2;
                    }
                }

            }

        }
    }

    public static void ViewReports() {
        clearConsole();
        System.out.println("""
                       \t  _____                       _       
                       \t |  __ \\                     | |      \t
                       \t | |__) |___ _ __   ___  _ __| |_ ___ 
                       \t |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|
                       \t | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\
                       \t |_|  \\_\\___| .__/ \\___/|_|   \\__|___/
                       \t            | |                       
                       \t            |_|                       
                               ________________________________________""");

        System.out.println("\n\t\t[1] Customer Reports\n\n\t\t[2] Item Reports\n\n\t\t[3] Orders Reports\n");
        L1:
        while (true) {
            System.out.print("\tEnter option : ");
            char op = sc.next().charAt(0);
            switch (op) {
                case '1' -> CustomerReports();
                case '2' -> ItemReports();
                case '3' -> OrderReports();
                default -> {
                      System.out.println("\n");

                    System.out.println("\t\tInvaild Input...!\n");
                    L5:
                    while (true) {
                        System.out.print("\tDO you want to enter option again (Y/N) :");
                        op = sc.next().charAt(0);
                        if (op == 'y' || op == 'Y') {
                            clearLine(6);
                            continue L1;
                        } else if (op == 'n' || op == 'N') {
                            Home();
                        } else {
                            clearLine(1);
                            continue L5;
                        }

                    }
                }
            }
        }
    }

    public static void CustomerReports() {
        clearConsole();
        System.out.println("""
                       \t   _____          _                              _____                       _       
                       \t  / ____|        | |                            |  __ \\                     | |      
                       \t | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ 
                       \t | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|
                       \t | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\
                       \t  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/
                       \t                                                           | |                       
                       \t                                                           |_|                       
                           \t______________________________________________________________________________________""");

        System.out.println("\n\t\t[1] Best in Customers");
        System.out.println("\n\t\t[2] View Customers ");
        System.out.println("\n\t\t[3] All Customer Report\n");
        L1:
        while (true) {
            System.out.print("\tEnter option : ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    BestInCustomers();
                    break;
                case 2:
                    ViewCustomers();
                    break;
                case 3:
                    AllCustomerReports();
                    break;
                default:
                    System.out.println("\n");

                    System.out.println("\t\tInvaild Input...!\n");
                    L5:
                    while (true) {
                        System.out.print("\tDO you want to enter option again (Y/N) :");
                        op = sc.next().charAt(0);
                        if (op == 'y' || op == 'Y') {
                            clearLine(6);
                            continue L1;
                        } else if (op == 'n' || op == 'N') {
                            ViewReports();
                        } else {
                            clearLine(1);
                            continue L5;
                        }

                    }
            }
        }
    }

    public static void BestInCustomers() {
        clearConsole();
        System.out.println("""
                       \t  ____            _     _____          _____          _                                
                       \t |  _ \\          | |   |_   _|        / ____|        | |                               
                       \t | |_) | ___  ___| |_    | |  _ __   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ 
                       \t |  _ < / _ \\/ __| __|   | | | '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|
                       \t | |_) |  __/\\__ \\ |_   _| |_| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\
                       \t |____/ \\___||___/\\__| |_____|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/
                                                                                                              
                              _________________________________________________________________________________________ """);

        System.out.println("\n\n\t\t\t+----------------+----------+----------------+");
        System.out.println("\t\t\t|  Customer ID   | All QTY  |  Total Amount  |");
        System.out.println("\t\t\t+----------------+----------+----------------+");

        String[] uniquePhones = new String[withOutDuplicatePhoneNum().length];
        int[] totalQty = new int[withOutDuplicatePhoneNum().length];
        double[] totalAmount = new double[withOutDuplicatePhoneNum().length];

        for (int j = 0; j < withOutDuplicatePhoneNum().length; j++) {

            int[] tem = duplicatePhoneIndex(withOutDuplicatePhoneNum()[j]);

            int xsCount = 0;
            int sCount = 0;
            int mCount = 0;
            int lCount = 0;
            int xlCount = 0;
            int xxlCount = 0;

            for (int i : tem) {
                switch (sizeArr[i]) {
                    case "XS" ->
                        xsCount += qtyArr[i];
                    case "S" ->
                        sCount += qtyArr[i];
                    case "M" ->
                        mCount += qtyArr[i];
                    case "L" ->
                        lCount += qtyArr[i];
                    case "XL" ->
                        xlCount += qtyArr[i];
                    case "XXL" ->
                        xxlCount += qtyArr[i];

                }
            }
            double Amount = 0;
            int TotalQty = 0;
            int[] qtyTable = {xsCount, sCount, mCount, lCount, xlCount, xxlCount};
            for (int qty : qtyTable) {
                TotalQty += qty;
            }
            double[] amountTable = {xsCount * 600, sCount * 800, mCount * 900, lCount * 1000, xlCount * 1100, xxlCount * 1200};
            for (double amount : amountTable) {
                Amount += amount;
            }
            uniquePhones[j] = withOutDuplicatePhoneNum()[j];
            totalQty[j] = TotalQty;
            totalAmount[j] = Amount;

        }

        for (int i = 0; i < withOutDuplicatePhoneNum().length; i++) {
            for (int j = 0; j < totalAmount.length - 1; j++) {
                if (totalQty[j] < totalQty[j + 1]) {
                    double temamount = totalAmount[j + 1];
                    totalAmount[j + 1] = totalAmount[j];
                    totalAmount[j] = temamount;

                    int temqty = totalQty[j + 1];
                    totalQty[j + 1] = totalQty[j];
                    totalQty[j] = temqty;

                    String temphone = uniquePhones[j + 1];
                    uniquePhones[j + 1] = uniquePhones[j];
                    uniquePhones[j] = temphone;
                }
            }
        }

        for (int i = 0; i < withOutDuplicatePhoneNum().length; i++) {
            System.out.println("\t\t\t|                |          |                |");
            System.out.printf("\t\t\t|  %10s    |%6d    |%14.2f  |%n", uniquePhones[i], totalQty[i], totalAmount[i]);

        }
        System.out.println("\t\t\t|                |          |                |");
        System.out.println("\t\t\t+----------------+----------+----------------+\n\n");
        tableAfterOption();
    }

    public static String[] withOutDuplicatePhoneNum() {

        String[] temPhoneArr = new String[phoneArr.length];
        int newLength = 0;

        for (int i = 0; i < phoneArr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < newLength; j++) {
                if (phoneArr[i].equals(temPhoneArr[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temPhoneArr[newLength] = phoneArr[i];
                newLength++;
            }
        }

        String[] newPhoneArr = new String[newLength];
        for (int i = 0; i < newLength; i++) {
            newPhoneArr[i] = temPhoneArr[i];
        }
//        System.out.println(Arrays.toString(newPhoneArr));

        return newPhoneArr;
    }

    public static void ViewCustomers() {
        clearConsole();
        System.out.println("""
                       \t __      ___                  _____          _                                
                       \t \\ \\    / (_)                / ____|        | |                               
                       \t  \\ \\  / / _  _____      __ | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ 
                       \t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|
                       \t    \\  /  | |  __/\\ V  V /  | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\
                       \t     \\/   |_|\\___| \\_/\\_/    \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/
                          \t________________________________________________________________________________ \n\n""");

        System.out.println("\t\t\t+----------------+----------+----------------+");
        System.out.println("\t\t\t|  Customer ID   | All QTY  |  Total Amount  |");
        System.out.println("\t\t\t+----------------+----------+----------------+");

        for (String x : withOutDuplicatePhoneNum()) {

            int[] tem = duplicatePhoneIndex(x);

            int xsCount = 0;
            int sCount = 0;
            int mCount = 0;
            int lCount = 0;
            int xlCount = 0;
            int xxlCount = 0;

            for (int i : tem) {
                switch (sizeArr[i]) {
                    case "XS" ->
                        xsCount += qtyArr[i];
                    case "S" ->
                        sCount += qtyArr[i];
                    case "M" ->
                        mCount += qtyArr[i];
                    case "L" ->
                        lCount += qtyArr[i];
                    case "XL" ->
                        xlCount += qtyArr[i];
                    case "XXL" ->
                        xxlCount += qtyArr[i];

                }
            }
            double Amount = 0;
            int totalQty = 0;
            int[] qtyTable = {xsCount, sCount, mCount, lCount, xlCount, xxlCount};
            for (int qty : qtyTable) {
                totalQty += qty;
            }
            double[] amountTable = {xsCount * 600, sCount * 800, mCount * 900, lCount * 1000, xlCount * 1100, xxlCount * 1200};
            for (double amount : amountTable) {
                Amount += amount;
            }
            System.out.println("\t\t\t|                |          |                |");
            System.out.printf("\t\t\t| %-14s |%6d    |%14.2f  |%n", x, totalQty, Amount);

        }
        System.out.println("\t\t\t|                |          |                |");
        System.out.println("\t\t\t+----------------+----------+----------------+\n\n");
        tableAfterOption();
    }

    public static int[] duplicatePhoneIndex(String phoneNumber) {

        String number = phoneNumber;
        boolean found = false;
        int j = 0;
        int[] tem = new int[idArr.length];

        for (int i = 0; i < idArr.length; i++) {
            // thawa kalikawa array ekata save kirima
            if (phoneArr[i].equalsIgnoreCase(number)) {
                j++;
                tem[j - 1] = i;
                found = true;
            }

        }
        int[] tem2 = new int[j];
        for (int i = 0; i < j; i++) {
            tem2[i] = tem[i];
        }
//        System.out.println(Arrays.toString(tem2));
        return tem2;
    }

    public static void AllCustomerReports() {
        clearConsole();
        System.out.println("""
                       \t           _ _    _____          _                              _____                       _   
                       \t     /\\   | | |  / ____|        | |                            |  __ \\                     | |  
                       \t    /  \\  | | | | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ 
                       \t   / /\\ \\ | | | | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __|
                       \t  / ____ \\| | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_ 
                       \t /_/    \\_\\_|_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|
                       \t                                                                          | |                   
                       \t                                                                          |_|                   
                              ___________________________________________________________________________________________________\n\n""");

        System.out.println("\t\t+----------------+-------+-------+-------+-------+-------+-------+--------------+");
        System.out.println("\t\t|  Phone Number  |   XS  |   S   |   M   |   L   |   XL  |  XXL  |     Total    |");
        System.out.println("\t\t+----------------+-------+-------+-------+-------+-------+-------+--------------+");

        //---------------------------------------------------
        for (String x : withOutDuplicatePhoneNum()) {

            int[] tem = duplicatePhoneIndex(x);

            int xsCount = 0;
            int sCount = 0;
            int mCount = 0;
            int lCount = 0;
            int xlCount = 0;
            int xxlCount = 0;

            for (int i : tem) {
                switch (sizeArr[i]) {
                    case "XS" ->
                        xsCount += qtyArr[i];
                    case "S" ->
                        sCount += qtyArr[i];
                    case "M" ->
                        mCount += qtyArr[i];
                    case "L" ->
                        lCount += qtyArr[i];
                    case "XL" ->
                        xlCount += qtyArr[i];
                    case "XXL" ->
                        xxlCount += qtyArr[i];

                }
            }
            double Amount = 0;
            int[] qtyTable = {xsCount, sCount, mCount, lCount, xlCount, xxlCount};

            double[] amountTable = {xsCount * 600, sCount * 800, mCount * 900, lCount * 1000, xlCount * 1100, xxlCount * 1200};
            for (double amount : amountTable) {
                Amount += amount;
            }
            System.out.println("\t\t|                |       |       |       |       |       |       |              |");
            System.out.printf("\t\t|  %10s    |   %-4d|   %-4d|   %-4d|   %-4d|   %-4d|   %-4d|%12.2f  |%n", x, qtyTable[0], qtyTable[1], qtyTable[2], qtyTable[3], qtyTable[4], qtyTable[5], Amount);

        }
        System.out.println("\t\t|                |       |       |       |       |       |       |              |");
        System.out.println("\t\t+----------------+-------+-------+-------+-------+-------+-------+--------------+\n\n");

        tableAfterOption();

    }

    public static void ItemReports() {
        clearConsole();
        System.out.println("""
                       \t  _____ _                   _____                       _       
                       \t |_   _| |                 |  __ \\                     | |      
                       \t   | | | |_ ___ _ __ ___   | |__) |___ _ __   ___  _ __| |_ ___ 
                       \t   | | | __/ _ \\ '_ ` _ \\  |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|
                       \t  _| |_| ||  __/ | | | | | | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\
                       \t |_____|\\__\\___|_| |_| |_| |_|  \\_\\___| .__/ \\___/|_|   \\__|___/
                       \t                                      | |                       
                       \t                                      |_|                       
                              __________________________________________________________________""");
        System.out.println("\n\n\t\t[1] Best Selling Categories Sorted by QTY\n\n\t\t[2] Best Selling Categories Sorted by Amount");
        L1:
        while (true) {
            System.out.print("\n\tEnter option : ");
            char op = sc.next().charAt(0);
            switch (op) {
                case '1':
                    sortedByQTY();
                    break;
                case '2':
                    sortedbyAmount();
                    break;
                default:
                    System.out.println("\n");

                    System.out.println("\t\tInvaild Input...!\n");
                    L5:
                    while (true) {
                        System.out.print("\tDO you want to enter option again (Y/N) :");
                        op = sc.next().charAt(0);
                        if (op == 'y' || op == 'Y') {
                            clearLine(7);
                            continue L1;
                        } else if (op == 'n' || op == 'N') {
                            ViewReports();
                        } else {
                            clearLine(1);
                            continue L5;
                        }

                    }
            }
        }
    }

    public static void sortedByQTY() {
        clearConsole();
        System.out.println("""
                       \t   _____            _           _   ____           ____ _________     __
                       \t  / ____|          | |         | | |  _ \\         / __ \\__   __\\ \\   / /
                       \t | (___   ___  _ __| |_ ___  __| | | |_) |_   _  | |  | | | |   \\ \\_/ / 
                       \t  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | | | |  | | | |    \\   /  
                       \t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| | | |__| | | |     | |   
                       \t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, |  \\___\\_\\ |_|     |_|   
                       \t                                           __/ |                        
                       \t                                          |___/                         
                              __________________________________________________________________________""");

        int xsCount = 0;
        int sCount = 0;
        int mCount = 0;
        int lCount = 0;
        int xlCount = 0;
        int xxlCount = 0;

        for (int i = 0; i < idArr.length; i++) {
            switch (sizeArr[i]) {
                case "XS" ->
                    xsCount += qtyArr[i];
                case "S" ->
                    sCount += qtyArr[i];
                case "M" ->
                    mCount += qtyArr[i];
                case "L" ->
                    lCount += qtyArr[i];
                case "XL" ->
                    xlCount += qtyArr[i];
                case "XXL" ->
                    xxlCount += qtyArr[i];

            }
        }
        String[] temSizeArr = {"XS", "S", "M", "L", "XL", "XXL"};

        int[] qtyTable = {xsCount, sCount, mCount, lCount, xlCount, xxlCount};

        double[] amountTable = {xsCount * 600, sCount * 800, mCount * 900, lCount * 1000, xlCount * 1100, xxlCount * 1200};

        //-------------decending 
        for (int i = 0; i < qtyTable.length; i++) {
            for (int j = 0; j < qtyTable.length - 1; j++) {
                if (qtyTable[j] < qtyTable[j + 1]) {
                    int temqty = qtyTable[j + 1];
                    qtyTable[j + 1] = qtyTable[j];
                    qtyTable[j] = temqty;

                    double temamount = amountTable[j + 1];
                    amountTable[j + 1] = amountTable[j];
                    amountTable[j] = temamount;

                    String tempSize = temSizeArr[j + 1];
                    temSizeArr[j + 1] = temSizeArr[j];
                    temSizeArr[j] = tempSize;
                }
            }
        }

        double total = 0;

        System.out.println("\n\t\t\t+----------+----------+----------------+");
        System.out.println("\t\t\t|   Size   |    QTY   |      Amount    |");
        System.out.println("\t\t\t+----------+----------+----------------+");
        for (int i = 0; i < qtyTable.length; i++) {
            System.out.println("\t\t\t|          |          |                |");
            System.out.printf("\t\t\t|  %-4s    |    %-6d|  %11.2f   |%n", temSizeArr[i], qtyTable[i], amountTable[i]);
            total += amountTable[i];
        }
        System.out.println("\t\t\t|          |          |                |");
        System.out.println("\t\t\t+----------+----------+----------------+");
        System.out.printf("\t\t\t|  Total Amount       |  %11.2f   |%n", total);
        System.out.println("\t\t\t+---------------------+----------------+\n\n");

        tableAfterOption();
    }

    public static void sortedbyAmount() { //sort kirimata atha
        clearConsole();
        System.out.println("""
                       \t   _____            _           _   ____                                               _   
                       \t  / ____|          | |         | | |  _ \\            /\\                               | |  
                       \t | (___   ___  _ __| |_ ___  __| | | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ 
                       \t  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|
                       \t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ 
                       \t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|
                       \t                                           __/ |                                           
                       \t                                          |___/                                            
                               _____________________________________________________________________________________________""");
        int xsCount = 0;
        int sCount = 0;
        int mCount = 0;
        int lCount = 0;
        int xlCount = 0;
        int xxlCount = 0;

        for (int i = 0; i < idArr.length; i++) {
            switch (sizeArr[i]) {
                case "XS" ->
                    xsCount += qtyArr[i];
                case "S" ->
                    sCount += qtyArr[i];
                case "M" ->
                    mCount += qtyArr[i];
                case "L" ->
                    lCount += qtyArr[i];
                case "XL" ->
                    xlCount += qtyArr[i];
                case "XXL" ->
                    xxlCount += qtyArr[i];

            }
        }
        String[] temSizeArr = {"XS", "S", "M", "L", "XL", "XXL"};

        int[] qtyTable = {xsCount, sCount, mCount, lCount, xlCount, xxlCount};

        double[] amountTable = {xsCount * 600, sCount * 800, mCount * 900, lCount * 1000, xlCount * 1100, xxlCount * 1200};

        //-------------decending 
        for (int i = 0; i < qtyTable.length; i++) {
            for (int j = 0; j < amountTable.length - 1; j++) {
                if (amountTable[j] < amountTable[j + 1]) {
                    int temqty = qtyTable[j + 1];
                    qtyTable[j + 1] = qtyTable[j];
                    qtyTable[j] = temqty;

                    double temamount = amountTable[j + 1];
                    amountTable[j + 1] = amountTable[j];
                    amountTable[j] = temamount;

                    String tempSize = temSizeArr[j + 1];
                    temSizeArr[j + 1] = temSizeArr[j];
                    temSizeArr[j] = tempSize;
                }
            }
        }

        double total = 0;

        System.out.println("\n\t\t\t+----------+----------+----------------+");
        System.out.println("\t\t\t|   Size   |    QTY   |      Amount    |");
        System.out.println("\t\t\t+----------+----------+----------------+");
        for (int i = 0; i < qtyTable.length; i++) {
            System.out.println("\t\t\t|          |          |                |");
            System.out.printf("\t\t\t|  %-4s    |    %-6d|  %11.2f   |%n", temSizeArr[i], qtyTable[i], amountTable[i]);
            total += amountTable[i];
        }
        System.out.println("\t\t\t|          |          |                |");
        System.out.println("\t\t\t+----------+----------+----------------+");
        System.out.printf("\t\t\t|  Total Amount       |  %11.2f   |%n", total);
        System.out.println("\t\t\t+---------------------+----------------+\n\n");
        tableAfterOption();

    }

    public static void tableAfterOption() {
        while (true) {
            System.out.print("\tTo access the Main Menu , please enter 0 : ");
            char op = sc.next().charAt(0);
            switch (op) {
                case '0' ->
                    Home();
                default -> {
                    clearLine(1); // done
                    continue;
                }
            }
        }
    }

    public static void OrderReports() {
        clearConsole();
        System.out.println("""
                       \t   ____          _             _____                       _       
                       \t  / __ \\        | |           |  __ \\                     | |      
                       \t | |  | |_ __ __| | ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ 
                       \t | |  | | '__/ _` |/ _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|
                       \t | |__| | | | (_| |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\
                       \t  \\____/|_|  \\__,_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/
                       \t                                         | |                       
                       \t                                         |_|                       
                               ____________________________________________________________________""");
        System.out.println("\n\n\t\t[1] All Orders");
        System.out.println("\n\t\t[2] Odrers By Amount\n");

        L1:
        while (true) {
            System.out.print("\tEnter option : ");
            char op = sc.next().charAt(0);
            switch (op) {
                case '1':
                    AllOrders();
                    break;
                case '2':
                    OrderByAmount();
                    break;
                default:
                    System.out.println("\n");

                    System.out.println("\t\tInvaild Input...!\n");
                    L5:
                    while (true) {
                        System.out.print("\tDO you want to enter option again (Y/N) :");
                        op = sc.next().charAt(0);
                        switch (op) {
                            case 'y', 'Y' -> {
                                clearLine(6);
                                continue L1;
                            }
                            case 'n', 'N' ->
                                ViewReports();
                            default -> {
                                clearLine(1);
                                continue L5;
                            }
                        }
                    }
            }
        }

    }

    public static void AllOrders() {
        clearConsole();
        System.out.println("""
                           \t\t __      ___                  ____          _               
                           \t\t \\ \\    / (_)                / __ \\        | |              
                           \t\t  \\ \\  / / _  _____      __ | |  | |_ __ __| | ___ _ __ ___ 
                           \t\t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |  | | '__/ _` |/ _ \\ '__/ __|
                           \t\t    \\  /  | |  __/\\ V  V /  | |__| | | | (_| |  __/ |  \\__ \\
                           \t\t     \\/   |_|\\___| \\_/\\_/    \\____/|_|  \\__,_|\\___|_|  |___/
                                   \t_____________________________________________________________   \n\n""");

        System.out.println("\t\t+------------+-------------+------+-------+------------+--------------+");
        System.out.println("\t\t|  Order ID  | Customer ID | Size |  QTy  |   Amount   |    Status    |");
        System.out.println("\t\t+------------+-------------+------+-------+------------+--------------+");

        for (int i = 0; i < idArr.length; i++) {
            System.out.println("\t\t|            |             |      |       |            |              |");
            System.out.printf("\t\t| %-7s  | %-10s  |  %-4s|   %-4d| %9.2f  |  %-12s|%n", idArr[idArr.length - 1 - i], phoneArr[idArr.length - 1 - i], sizeArr[idArr.length - 1 - i], qtyArr[idArr.length - 1 - i], amountArr[idArr.length - 1 - i], statusArr[idArr.length - 1 - i]);

        }
        System.out.println("\t\t|            |             |      |       |            |              |");
        System.out.println("\t\t+------------+-------------+------+-------+------------+--------------+\n\n");
        L1:
        while (true) {
            System.out.print("\tTo access the Main Menu , please enter 0 : ");
            char op = sc.next().charAt(0);
            switch (op) {
                case '0' ->
                    Home();
                default -> {
                    clearLine(1); // done
                    continue L1;
                }
            }
        }
    }

    public static void OrderByAmount() {
        clearConsole();
        System.out.println("""
                           \t   ____          _                 ____                                               _   
                           \t  / __ \\        | |               |  _ \\            /\\                               | |  
                           \t | |  | |_ __ __| | ___ _ __ ___  | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ 
                           \t | |  | | '__/ _` |/ _ \\ '__/ __| |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|
                           \t | |__| | | | (_| |  __/ |  \\__ \\ | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ 
                           \t  \\____/|_|  \\__,_|\\___|_|  |___/ |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|
                           \t                                          __/ |                                           
                           \t                                         |___/                                            
                                   ____________________________________________________________________________________________\n\n""");

        //-------------decending 
        int temQtyArr[] = new int[idArr.length];
        double temAmount[] = new double[idArr.length];
        String temSizeArrr[] = new String[idArr.length];
        String temPhoneArr[] = new String[idArr.length];
        String temIdArr[] = new String[idArr.length];
        String temStatusArr[] = new String[idArr.length];

        for (int i = 0; i < idArr.length; i++) {
            temAmount[i] = amountArr[i];
            temQtyArr[i] = qtyArr[i];
            temSizeArrr[i] = sizeArr[i];
            temPhoneArr[i] = phoneArr[i];
            temIdArr[i] = idArr[i];
            temStatusArr[i] = statusArr[i];

        }

        for (int i = 0; i < idArr.length; i++) {
            for (int j = 0; j < idArr.length-1; j++) {
                if (temAmount[j] < temAmount[j + 1]) {
                    int temqty = temQtyArr[j + 1];
                    temQtyArr[j + 1] = temQtyArr[j];
                    temQtyArr[j] = temqty;

                    double tempAmount = temAmount[j + 1];
                    temAmount[j + 1] = temAmount[j];
                    temAmount[j] = tempAmount;

                    String tempSize = temSizeArrr[j + 1];
                    temSizeArrr[j + 1] = temSizeArrr[j];
                    temSizeArrr[j] = tempSize;

                    String phtem = temPhoneArr[j + 1];
                    temPhoneArr[j + 1] = temPhoneArr[j];
                    temPhoneArr[j] = phtem;

                    String idtem = temIdArr[j + 1];
                    temIdArr[j + 1] = temIdArr[j];
                    temIdArr[j] = idtem;

                    String sttem = temStatusArr[j + 1];
                    temStatusArr[j + 1] = temStatusArr[j];
                    temStatusArr[j] = sttem;
                }
            }
        }

        System.out.println("\t+------------+-------------+------+-------+------------+--------------+");
        System.out.println("\t|  Order ID  | Customer ID | Size |  QTy  |   Amount   |    Status    |");
        System.out.println("\t+------------+-------------+------+-------+------------+--------------+");

        for (int i = 0; i < idArr.length; i++) {
            System.out.println("\t|            |             |      |       |            |              |");
            System.out.printf("\t| %-7s  | %-10s  |  %-4s|   %-4d| %9.2f  |  %-12s|%n", temIdArr[i], temPhoneArr[i], temSizeArrr[i], temQtyArr[i], temAmount[i], temStatusArr[i]);
        }
        System.out.println("\t|            |             |      |       |            |              |");
        System.out.println("\t+------------+-------------+------+-------+------------+--------------+\n\n");
        L1:
        while (true) {
            System.out.print("\tTo access the Main Menu , please enter 0 : ");
            char op = sc.next().charAt(0);
            switch (op) {
                case '0' ->
                    Home();
                default -> {
                    clearLine(1); // done
                    continue L1;
                }
            }

        }

    }

    public static void ordeStatusChengChange(int x) {

        if (statusArr[x].equalsIgnoreCase("Processing")) {
            System.out.println("\n\t\t[1] Order Delivering");
            System.out.println("\n\t\t[2] Odrer Delivered\n");

            L1:
            while (true) {
                System.out.print("\tEnter option : ");
                char op2 = sc.next().charAt(0);
                switch (op2) {
                    case '1':
                        statusArr[x] = OrderStatus(1);
                        System.out.println("\n\t\tStatus Updated..!\n");

                        L5:
                        while (true) {
                            System.out.print("\tDo you want to change anther status (Y/N) : ");

                            char op = sc.next().charAt(0);
                            switch (op) {
                                case 'y', 'Y' -> {
                                    OrderStatus();
                                    continue L1;
                                }
                                case 'n', 'N' ->
                                    Home();
                                default -> {
                                    clearLine(1);
                                    continue L5;
                                }
                            }
                        }

                    case '2':
                        statusArr[x] = OrderStatus(2);
                        System.out.println("\n\t\tStatus Updated..!\n");
                        L5:
                        while (true) {
                            System.out.print("\tDo you want to change anther status (Y/N) : ");
                            char op = sc.next().charAt(0);
                            switch (op) {
                                case 'y', 'Y' -> {
                                    OrderStatus();
                                    continue L1;
                                }
                                case 'n', 'N' ->
                                    Home();
                                default -> {
                                    clearLine(1);
                                    continue L5;
                                }
                            }

                        }

                    default:
                        System.out.println("\n\n\t\tInvaild Input...!\n");
                        L5:
                        while (true) {
                            System.out.print("\tDO you want to enter option again (Y/N) :");
                            char op = sc.next().charAt(0);
                            switch (op) {
                                case 'y', 'Y' -> {
                                    clearLine(6);
                                    continue L1;
                                }
                                case 'n', 'N' ->
                                   Home();
                                default -> {
                                    clearLine(1);
                                    continue L5;
                                }
                            }

                        }
                }
            }
        } else if (statusArr[x].equalsIgnoreCase("Delivering")) {

            System.out.println("\n\t\t[1] Odrer Delivered\n");

            L2:
            while (true) {
                System.out.print("\tEnter option : ");
               char op2 = sc.next().charAt(0);
                switch (op2) {
                    case '1':
                        System.out.println("\n\t\tStatus Updated..!\n");
                        statusArr[x] = OrderStatus(2);

                        while (true) {
                            System.out.print("\tDo you want to change anther status (Y/N) : ");
                            char op = sc.next().charAt(0);
                            switch (op) {
                                case 'y', 'Y' -> {
                                    OrderStatus();
                                    continue L2;
                                }
                                case 'n', 'N' ->
                                    Home();
                                default -> {
                                    clearLine(1);
                                    continue;
                                }
                            }
                        }
                    default:
                        System.out.println("\n");
                        System.out.println("\t\tInvaild Input...!\n");
                        while (true) {
                            System.out.print("\tDO you want to enter option again (Y/N) :");
                            char op = sc.next().charAt(0);
                            switch (op) {
                                case 'y', 'Y' -> {
                                    clearLine(6);
                                    continue L2;
                                }
                                case 'n', 'N' ->
                                   Home();
                                default -> {
                                    clearLine(1);
                                    continue;
                                }
                            }
                        }
                }
            }
        } else {
            System.out.print("\n\n");
            while (true) {
                System.out.printf("\t%-30s%2s", "Do you want to search another order (Y/N) ?", ": ");
                char op = sc.next().charAt(0);
                switch (op) {
                    case 'y', 'Y' ->
                        SearchOrder();
                    case 'n', 'N' ->
                        Home();
                    default -> {
                        clearLine(2);
                        continue;
                    }
                }

            }

        }
    }

    public static void OrderStatus() {
        clearConsole();

        System.out.println("""
                           \t   ____          _              _____ _        _             
                           \t  / __ \\        | |            / ____| |      | |            
                           \t | |  | |_ __ __| | ___ _ __  | (___ | |_ __ _| |_ _   _ ___ 
                           \t | |  | | '__/ _` |/ _ \\ '__|  \\___ \\| __/ _` | __| | | / __|
                           \t | |__| | | | (_| |  __/ |     ____) | || (_| | |_| |_| \\__ \\
                           \t  \\____/|_|  \\__,_|\\___|_|    |_____/ \\__\\__,_|\\__|\\__,_|___/
                                  ________________________________________________________________                                                            
                                                                                        """);

        System.out.printf("\n\t%-20s%2s", "Enter Order ID", ": ");
        String inputId = sc.next();
        int x = 0;
        boolean found = false;
        for (String id : idArr) {
            if (id.equals(inputId)) {
                for (int i = 0; i < idArr.length; i++) {
                    if (id == idArr[i]) {
                        x = i;
                    }
                }
                found = true;
                break;
            }
        }
        if (found) {
            System.out.printf("\n\t%-20s%2s%10s", "Phone Number", ": ", phoneArr[x]);
            System.out.printf("\n\t%-20s%2s%-10s", "Size", ": ", sizeArr[x]);
            System.out.printf("\n\t%-20s%2s%-10d", "QTY", ": ", qtyArr[x]);
            System.out.printf("\n\t%-20s%2s%-10.2f", "Amount", ": ", amountArr[x]);
            System.out.printf("\n\t%-20s%2s%-10s", "Status", ": ", statusArr[x]);
            System.out.println("\n");

            if (statusArr[x].equalsIgnoreCase("Delivered")) {
                System.out.println("\n\t\tCan't change this order status , Order already delivered..!\n\n");
                while (true) {
                    System.out.print("\tDo you want to chage another order satatus (Y/N) : ");
                    char op3 = sc.next().charAt(0);
                    switch (op3) {
                        case 'y', 'Y' ->
                            OrderStatus();
                        case 'n', 'N' ->
                            Home();
                        default -> {
                            clearLine(1);
                            continue;
                        }
                    }
                }
            } else {
                while (true) {
                    System.out.print("\tDo you want to change this order satus (Y/N ) ? :");
                    char op = sc.next().charAt(0);
                    switch (op) {
                        case 'y', 'Y' ->
                            ordeStatusChengChange(x);
                        case 'n', 'N' ->
                            Home();
                        default -> {
                            clearLine(1);
                            continue;
                        }
                    }
                }
            }
        }
        if (!found) {
            System.out.println("\n\t\t  Invalid ID..\n");
            while (true) {
                System.out.printf("\t%-30s%2s", "Do you want to search another order (Y/N) ?", ": ");
                char op = sc.next().charAt(0);
                switch (op) {
                    case 'y', 'Y' ->
                        OrderStatus();
                    case 'n', 'N' ->
                        Home();
                    default -> {
                        clearLine(1);
                        continue;
                    }
                }
            }
        }
    }

    public static void DeleteOrder() {
        clearConsole();
        System.out.println("""
                           \t  _____       _      _          ____          _           
                           \t |  __ \\     | |    | |        / __ \\        | |          
                           \t | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __ 
                           \t | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|
                           \t | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |   
                           \t |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|   
                                  ____________________________________________________________    """);

        System.out.printf("\n\n\t%-20s%2s", "Enter Order ID", ": ");
        String inputId = sc.next();
        int x = 0;
        boolean found = false;

        for (String id : idArr) {
            if (id.equals(inputId)) {
                for (int i = 0; i < idArr.length; i++) {
                    if (id == idArr[i]) {
                        x = i;
                    }
                }
                found = true;
                break;
            }
        }
        if (found) {
            System.out.printf("\n\t%-20s%2s%10s", "Phone Number", ": ", phoneArr[x]);
            System.out.printf("\n\t%-20s%2s%-10s", "Size", ": ", sizeArr[x]);
            System.out.printf("\n\t%-20s%2s%-10d", "QTY", ": ", qtyArr[x]);
            System.out.printf("\n\t%-20s%2s%-10.2f", "Amount", ": ", amountArr[x]);
            System.out.printf("\n\t%-20s%2s%-10s", "Status", ": ", statusArr[x]);

            if (statusArr[x].equalsIgnoreCase("Processing")) {
                System.out.println("\n\n");
                L0:
                while (true) {
                    System.out.printf("\t%-30s%2s", "Do you want to delete this order (Y/N) ?", ": ");
                    char op = sc.next().charAt(0);
                    switch (op) {
                        case 'y', 'Y' -> {
                            System.out.println("\n\t\tOrder Deleted..!");
                            for (int i = x; i < idArr.length - 1; i++) {
                                phoneArr[i] = phoneArr[i + 1];
                                sizeArr[i] = sizeArr[i + 1];
                                qtyArr[i] = qtyArr[i + 1];
                                amountArr[i] = amountArr[i + 1];
                                statusArr[i] = statusArr[i + 1];
                                idArr[i] = idArr[i + 1];
                                
                            }   //                        index--;
                            declementArry();
                            System.out.println("\n");
                            deleteOption();
                        }
                        case 'n', 'N' -> Home();
                        default -> {
                            clearLine(3);
                            continue L0;
                        }
                    }
                }
            } else if (statusArr[x].equalsIgnoreCase("Delivering")) {
                System.out.println("\n\n\t\tCan't delete this order , Order already delivering..! \n\n");
                deleteOption();
            } else {
                System.out.println("\n\n\t\tCan't delete this order , Order already deliverd..! \n\n");
                deleteOption();
            }
        }
        if (!found) {
            System.out.println("\n\t\tInvalid ID..\n\n");
            deleteOption();
        }
    }

    public static void deleteOption() {
        while (true) {
            System.out.printf("\t%-30s%2s", "Do you want to delete another order (Y/N) ?", ": ");
            char op = sc.next().charAt(0);
            switch (op) {
                case 'y', 'Y' ->
                    DeleteOrder();
                case 'n', 'N' ->
                    Home();
                default -> {
                    clearLine(1);
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {

        Home();

    }
}
