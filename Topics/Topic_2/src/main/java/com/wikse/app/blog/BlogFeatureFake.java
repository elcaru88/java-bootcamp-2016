package com.wikse.app.blog;

public class BlogFeatureFake implements BlogFeature {

	@Override
	public boolean addNewEntry(Entry entry) {
		return true;
	}

	@Override
	public boolean removeEntry(Entry entry) {
		return true;
	}

}
