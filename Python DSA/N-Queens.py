def is_safe(board, row, col, n):
    # Check this row on left side
    for i in range(col):
        if board[row][i] == 1:
            return False

    # Check upper diagonal on left side
    i, j = row, col
    while i >= 0 and j >= 0:
        if board[i][j] == 1:
            return False
        i -= 1
        j -= 1

    # Check lower diagonal on left side
    i, j = row, col
    while i < n and j >= 0:
        if board[i][j] == 1:
            return False
        i += 1
        j -= 1

    return True

def print_solution(board, n):
    for i in range(n):
        for j in range(n):
            print("Q " if board[i][j] == 1 else ". ", end="")
        print()
    print()

def solve_n_queens(board, col, n):
    # Base case: If all queens are placed, then return true
    if col >= n:
        print_solution(board, n)
        return True  # Changed to True to indicate a solution was found

    # Consider this column and try placing this queen in all rows one by one
    found_solution = False
    for i in range(n):
        # Check if the queen can be placed on board[i][col]
        if is_safe(board, i, col, n):
            board[i][col] = 1

            # Recur to place the rest of the queens
            if solve_n_queens(board, col + 1, n):
                found_solution = True

            # If placing queen in board[i][col] doesn't lead to a solution,
            # then remove queen from board[i][col] (backtrack)
            board[i][col] = 0
    return found_solution # Return whether any solution was found in this path

if __name__ == "__main__":
    n = int(input("Enter the number of queens: "))
    board = [[0 for _ in range(n)] for _ in range(n)]

    if not solve_n_queens(board, 0, n):
        print("Solution does not exist")