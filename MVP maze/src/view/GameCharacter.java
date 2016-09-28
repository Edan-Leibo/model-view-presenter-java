/**
 * 
 */
package view;

import java.io.File;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * @author Edan
 *
 */
public class GameCharacter {
	private int floor;
	private int row;
	private int col;
	
	public GameCharacter(int floor, int row, int col){
		this.floor=floor;
		this.row=row;
		this.col=col;
	}
	
	public void paint(PaintEvent e, int w, int h){
		//e.gc.setForeground(new Color(null, 100,100,100));
		//e.gc.drawOval(, h*row, w, h);
		Image image = new Image(null,"resources"+File.separator+"pumba.gif");
		e.gc.drawImage(image,0,0,150,121,w*col,h*row, w, h);
	}

	
	/**
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @return the col
	 */
	public int getCol() {
		return col;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}

	/**
	 * @param col the col to set
	 */
	public void setCol(int col) {
		this.col = col;
	}

}
