import java.util.Scanner;

public class TinhTongDuongCheoMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử có tọa độ ở hàng ngang và cột dọc bằng nhau trong ma trận vuông có sẵn

        // Khởi tạo ma trận vuông 3x3 có sẵn các phần tử
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Hiển thị ma trận có sẵn
        System.out.println("Ma trận có sẵn:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Tính tổng các phần tử nằm trên đường chéo chính (hàng i, cột i)
        int sumDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumDiagonal += matrix[i][i];
        }

        // In ra kết quả
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sumDiagonal);

        // Bước 2: Thu thập mảng thực từ người dùng
        System.out.println("\nBước 2: Thu thập mảng thực từ người dùng.");

        // Hỏi kích thước của ma trận vuông
        System.out.print("Nhập kích thước của ma trận vuông (n x n): ");
        int n = scanner.nextInt();

        // Khởi tạo ma trận vuông với kích thước n
        int[][] userMatrix = new int[n][n];

        // Nhập các phần tử của ma trận từ người dùng
        System.out.println("Nhập các phần tử cho ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử tại vị trí (" + i + ", " + j + "): ");
                userMatrix[i][j] = scanner.nextInt();
            }
        }

        // Hiển thị ma trận người dùng đã nhập
        System.out.println("Ma trận đã nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Tính tổng các phần tử trên đường chéo chính của ma trận người dùng nhập
        int sumUserDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumUserDiagonal += userMatrix[i][i];
        }

        // In ra kết quả tổng cho ma trận người dùng nhập
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sumUserDiagonal);

        scanner.close();
    }
}
