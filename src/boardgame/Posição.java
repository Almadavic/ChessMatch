
package boardgame;


public class Posição {
   
    private Integer row;
private Integer column;

public void setValues(Integer column , Integer row) {
    this.column=column;
    this.row=row;
}

public Posição() {   
}
   
public Posição(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }
    
public Integer getRow() {
        return row;
    }
    
public Integer getColumn() {
        return column;
    }

@Override
public String toString() {
    return row+", "+column;
}
}
