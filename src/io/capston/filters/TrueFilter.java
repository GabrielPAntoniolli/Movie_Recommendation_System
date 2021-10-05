package io.capston.filters;

import io.capston.filters.Filter;

public class TrueFilter implements Filter
{
	@Override
	public boolean satisfies(String id) 
	{
		return true;
	}
}
