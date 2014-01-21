package com.zetcode;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Tetris extends JFrame
{
	private JButton resetButton;
	private JLabel statusbar;

	public Tetris()
	{

		initUI();
	}

	private void initUI()
	{
		resetButton = new JButton("reset");
		resetButton.setSize(50, 50);
		statusbar = new JLabel(" 0");
		add(statusbar, BorderLayout.SOUTH);
		add(resetButton, BorderLayout.NORTH);
		Board board = new Board(this);
		add(board);
		board.start();
		setTitle("Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public JButton getResetButton()
	{
		return resetButton;
	}

	public void setResetButton(JButton resetButton)
	{
		this.resetButton = resetButton;
	}

	public JLabel getStatusBar()
	{

		return statusbar;
	}

	public static void main(String[] args)
	{

		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{

				Tetris game = new Tetris();
				game.setVisible(true);
			}
		});
	}
}