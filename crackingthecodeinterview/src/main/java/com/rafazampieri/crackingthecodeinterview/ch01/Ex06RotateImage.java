package com.rafazampieri.crackingthecodeinterview.ch01;

public class Ex06RotateImage {

	// page 73
	// Given an image represented by an NxN matrix, where each pixel in the
	// image is 4 bytes, write a method to rotate the image by 90 degrees. Can
	// you do this in place?

	public void rotateImage(int[][] imagePixels) {
		int layer = 1;
		for (int i = 0; i < imagePixels.length - layer; i++) {
			for (int j = i; j < imagePixels.length - layer; j++) {
				int x = i;
				int y = j;
				changePixel(imagePixels, x, y, 3);
			}
			layer++;
		}
	}

	private void changePixel(int[][] imagePixels, final int x, final int y, int numberOfTimes) {
		int pixel = imagePixels[x][y];
		int goToX = y;
		int goToY = (imagePixels.length - 1) - x;
		if (numberOfTimes != 0) {
			changePixel(imagePixels, goToX, goToY, --numberOfTimes);
		}
		imagePixels[goToX][goToY] = pixel;
	}

}
