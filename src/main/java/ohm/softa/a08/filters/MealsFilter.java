package ohm.softa.a08.filters;

import ohm.softa.a08.model.Meal;

import java.util.List;

public interface MealsFilter {

	public List<Meal> filter(List<Meal> filter);
}
