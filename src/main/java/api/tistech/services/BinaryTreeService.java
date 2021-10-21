package api.tistech.services;

import api.tistech.models.BinaryTree;

public class BinaryTreeService {

	public int total(BinaryTree node) {
		int sum = 0;

		do {
			sum += node.getValor();
			node = nextNode(node);
		} while (node != null);

		return sum;
	}

	private BinaryTree nextNode(BinaryTree node) {
		if (node.getRight() == null) {
			return null;
		}

		return node.getRight();
	}

}
