package com.javarush.task.task30.test;

import java.util.ArrayList;
import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

    private List<I> collection;
    private int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        System.out.println("itemsPerPage: " + itemsPerPage);
        System.out.println("collection.s: " + collection.size());
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if((itemCount() - itemCount() / itemsPerPage) > 0){
            return itemCount() / itemsPerPage + 1;
        }
        return itemCount() / itemsPerPage;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex <= 0 || pageIndex + 1 > pageCount()) {
            return -1;
        } else if (pageIndex >= 1 && pageIndex + 1 < pageCount()) {
            return itemsPerPage;
        } else if (pageIndex + 1 == pageCount()) {
            return  itemCount() - (pageCount() - 1)*itemsPerPage;
        }
        return -1;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
//    itemsPerPage: 10
//    collection.s: 24
//    itemIndex: 22
//    pageCount: 3
//    CCC
    public int pageIndex(int itemIndex) {
        System.out.println("itemIndex: " + itemIndex);
        System.out.println("pageCount: " + pageCount());
        if (itemIndex < 0 || itemIndex > itemCount() - 1) {
            System.out.println("AAA");
            return -1;
        } else if (itemIndex <= itemsPerPage) {
            System.out.println("BBB");
            return 0;
        } else  {
            System.out.println("CCC");
            return itemIndex - (itemsPerPage* (pageCount()-1));
        }
    }
}
