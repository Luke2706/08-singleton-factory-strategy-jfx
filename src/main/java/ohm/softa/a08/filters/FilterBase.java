package ohm.softa.a08.filters;

import ohm.softa.a08.model.Meal;

public abstract class FilterBase implements MealsFilter {

	public abstract boolean include(Meal m);
}
