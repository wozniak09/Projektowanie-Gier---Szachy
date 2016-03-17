package projektowanie.gier.szachy;

import java.awt.*;

import javax.swing.*;
public class CheckerProgram 
{
	public static int rows = 8;
	public static int columns = 8;
	public static Color col1 = Color.BLUE;
	public static Color col2 = Color.WHITE;
	public static void main(String[] args) 
	{
		JFrame checkerBoard = new JFrame();
		checkerBoard.setSize(600, 600);
		checkerBoard.setTitle("Szachownica");
		Container pane = checkerBoard.getContentPane();
		pane.setLayout(new GridLayout(rows, columns));
		Color temp;
		for (int i = 0; i < rows; i++)
		{
			if (i%2 == 0)
			{
				temp = col1;
			}
			else
			{
				temp = col2;
			}
			for (int j = 0; j < columns; j++)
			{
				JPanel panel = new JPanel();
				panel.setBackground(temp);
				if (temp.equals(col1))
				{
					temp = col2;
				}
				else
				{
					temp = col1;
				}
				pane.add(panel);
			}
		}
		checkerBoard.setVisible(true);
	}

}

