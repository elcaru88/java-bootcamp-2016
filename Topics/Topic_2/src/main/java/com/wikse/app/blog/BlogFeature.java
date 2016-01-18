package com.wikse.app.blog;

import java.util.List;

public interface BlogFeature {
	boolean addNewEntry(Entry entry);

	boolean removeEntry(Entry entry);

	List<Entry> getTenRecentEntries();
}
