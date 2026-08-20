class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> rows = new HashSet<>();
        HashSet<String> cols = new HashSet<>();
        HashSet<String> boxes = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char value = board[row][col];

                if (value == '.') {
                    continue;
                }

                String rowKey = value + "-" + row;
                String colKey = value + "-" + col;
                String boxKey = value + "-" + (row / 3) + "-" + (col / 3);

                if (rows.contains(rowKey) || cols.contains(colKey) || boxes.contains(boxKey)) {
                    return false;
                }

                rows.add(rowKey);
                cols.add(colKey);
                boxes.add(boxKey);
            }
        }
        return true;
    }
}
