package by.bsu.collection;

public enum FullItemEnum {
	ITEM_ID(true), PRICE(false), NAME(true);

	private boolean ascend;

	private FullItemEnum(boolean ascend) {
		this.ascend = ascend;
	};

	public void setAscend(boolean ascend) {
		this.ascend = ascend;
	}

	public boolean getAscend() {
		return ascend;
	}

}
