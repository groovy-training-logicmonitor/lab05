/**
 * Created by aknight on 6/28/17.
 */

/**
 * Returns a collection where each element is equal to the object passed in as a filter.
 *
 * @param collection Collection containing values we want to collect
 * @param filter The object to collect from collection
 * @return A collection where each value is equal to filter
 */
public <E> Collection<E> collect(Collection<E> collection, E filter) {
    Collection<E> result = new ArrayList<>();

    // Put your code here

    return result;
}

/**
 * Returns a collection where each element is not equal to the object passed in as a filter.
 *
 * @param collection Collection containing values we want to filter
 * @param filter The object to filter from collection
 * @return A collection where each value is not equal to filter
 */
public <E> Collection<E> filter(Collection<E> collection, E filter) {
    Collection<E> result = new ArrayList<>();

    // Put your code here

    return result;
}

/**
 * Returns a collection where each element is greather than the object passed in as a filter.
 *
 * @param collection Collection containing values we want to filter
 * @param filter The object to use to filter from collection
 * @return A collection where each value is not equal to filter
 */
public <E extends Comparable<E>> Collection<E> filterGreaterThan(Collection<E> collection, E filter) {
    Collection<E> result = new ArrayList<>();

    // Put your code here

    return result;
}

/**
 * Returns a collection where each element is greather than the object passed in as a filter.
 *
 * @param collection Collection containing values we want to filter
 * @param filter The object to use to filter from collection
 * @return A collection where each value is not equal to filter
 */
public <E extends Comparable<E>> Collection<E> filterLessThan(Collection<E> collection, E filter) {
    Collection<E> result = new ArrayList<>();

    // Put your code here

    return result;
}

def companies = ["Best Western", "LogicMonitor", "Optivus", "Ericsson", "Citrix Online", "Raplh's", "Disneyland", "Best Western"]
println collect(companies, "Best Western")
println filter(companies, "Best Western")
println filterGreaterThan(companies, "Ericsson")
println filterLessThan(companies, "Ericsson")