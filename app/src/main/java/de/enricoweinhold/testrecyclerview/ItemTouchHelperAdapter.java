package de.enricoweinhold.testrecyclerview;

interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void makeToastAfterMoved (int start, int end);
}
