package sharePaint.models;

import java.awt.Color;

import sharePaint.actions.LineAction;
import sharePaint.actions.PointAction;

public class Pen
{
	private int brushSize;
	private Color paintColor;
	private Canvas canvas;
	
	public Pen(Canvas canvas, int size, Color color)
	{
		this.brushSize = size;
		this.paintColor = color;
		this.canvas = canvas;
	}

	public void drawLine(int x1, int y1, int x2, int y2)
	{
		canvas.draw(new LineAction(paintColor, brushSize, x1, y1, x2, y2), true);
	}
	
	public void drawPoint(int x, int y)
	{
		canvas.draw(new PointAction(paintColor, brushSize, x, y), true);
	}

	public Color getColor()
	{
		return paintColor;
	}
	
	public int getSize()
	{
		return brushSize;
	}
}
