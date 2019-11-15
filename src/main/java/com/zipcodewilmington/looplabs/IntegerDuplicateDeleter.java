package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] removeThese = this.array;

        for (Integer integer : this.array) {

            if (getNumberOfOccurrences(integer) >= maxNumberOfDuplications) {
                removeThese = removeValue(removeThese, integer);
            }
        }
        return removeThese;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] removeThese = this.array;

        for (Integer integer : this.array) {

            if (getNumberOfOccurrences(integer) == exactNumberOfDuplications) {
                removeThese = removeValue(removeThese, integer);
            }
        }
        return removeThese;
    }


    // gets the number of occurrences of a single object in the array
    private Integer getNumberOfOccurrences(Integer objectToCount) {

        int counter = 0;

        for (Object s : this.array){

            if (s.equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }

    // removes all objects in the array that are equal to the given parameter
    private Integer[] removeValue(Integer[] intArray,Integer objectToRemove) {
        int counter = 0;
        Integer[] keepthese = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != objectToRemove) {
                keepthese[i - counter] = intArray[i];
            } else {
                counter++;
            }
        }
        Integer[] result = new Integer[intArray.length - counter];

        for (int j = 0; j < result.length; j++) {
            result[j] = keepthese[j];
        }
        return result;
    }
}
