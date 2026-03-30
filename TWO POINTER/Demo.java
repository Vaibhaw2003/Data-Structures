// Two Pointer Technique Example with a sorted array to find a pair that sums up to a target value.

// class Demo{
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int target = 5;
//         int left = 0;
//         int right = arr.length - 1;

//         while (left < right) {
//             int sum = arr[left] + arr[right];
//             if (sum == target) {
//                 System.out.println("Pair found: " + arr[left] + " and " + arr[right]);
//                 break;
//             } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//     }
// }

// Two Pointer Technique Example with a sorted array to find the target value index in the array.

// class Demo{
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int target = 3;
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (arr[mid] == target) {
//                 System.out.println("Target found at index: " + mid);
//                 break;
//             } else if (arr[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//     }
// }

// Two Pointer Technique Example with a sorted array to find the sum of two values that equals the target value index in the array using binary search.

class Demo{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        int left = 0;
        int right = arr.length - 1;

        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " " + arr[right]);
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}