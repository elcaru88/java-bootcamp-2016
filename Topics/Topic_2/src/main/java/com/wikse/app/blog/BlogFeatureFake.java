package com.wikse.app.blog;

import java.util.ArrayList;
import java.util.List;

public class BlogFeatureFake implements BlogFeature {

	@Override
	public boolean addNewEntry(Entry entry) {
		return true;
	}

	@Override
	public boolean removeEntry(Entry entry) {
		return true;
	}

	@Override
	public List<Entry> getTenRecentEntries() {
		List<Entry> entries= new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			entries.add(new Entry());
		}
		return entries;
	}

}
