package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] removeThese = this.array;

        for (String s : this.array) {

            if (getNumberOfOccurrences(s) >= maxNumberOfDuplications) {
                removeThese = removeValue(removeThese, s);
            }
        }
        return removeThese;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] removeThese = this.array;

        for (String s : this.array) {

            if (getNumberOfOccurrences(s) == exactNumberOfDuplications) {
                removeThese = removeValue(removeThese, s);
            }
        }
        return removeThese;
    }


    // gets the number of occurrences of a single object in the array
    private Integer getNumberOfOccurrences(String objectToCount) {

        int counter = 0;

        for (Object s : this.array){

            if (s.equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }

    // removes all objects in the array that are equal to the given parameter
    private String[] removeValue(String[] strArray,String objectToRemove) {
        int counter = 0;
        String[] keepthese = new String[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] != objectToRemove) {
                keepthese[i - counter] = strArray[i];
            } else {
                counter++;
            }
        }
        String[] result = new String[strArray.length - counter];

        for (int j = 0; j < result.length; j++) {
            result[j] = keepthese[j];
        }
        return result;
    }
}
