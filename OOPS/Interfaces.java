public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("Queen moves up,down,left,right and diagonally");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("Rook moves up,down,left and right");
    }
}

class Bishop implements chessPlayer {
    public void moves() {
        System.out.println("Bishop moves diagonally");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("King moves one step in any direction");
    }
}

class Knight implements chessPlayer {
    public void moves() {
        System.out.println("Knight moves in L shape");
    }
}

class Pawn implements chessPlayer {
    public void moves() {
        System.out.println("Pawn moves one step forward and diagonally to kill");
    }
}
