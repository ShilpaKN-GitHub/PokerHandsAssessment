enum HandRank {
	HIGH_CARD(1), PAIR(2), TWO_PAIR(3), THREE_OF_A_KIND(4), STRAIGHT(5), FLUSH(6), FULL_HOUSE(7), FOUR_OF_A_KIND(8),
	STRAIGHT_FLUSH(9), ROYAL_FLUSH(10);

	private int value;

	HandRank(int value) {
		this.value = value;
	}

	private int getValue() {
		return value;
	}

	int compareValue(HandRank anotherHandRank) {
		if (this.getValue() < anotherHandRank.getValue()) {
			return -1;
		} else if (this.getValue() > anotherHandRank.getValue()) {
			return 1;
		} else if (this.getValue() == anotherHandRank.getValue()) {
			return 0;
		}
		return 2;
	}

}
