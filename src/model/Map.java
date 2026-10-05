package model;

/**
 * The Map class represents a 2D grid structure used to model a zoo map.
 * It contains constants for different types of cells (e.g., available spaces,
 * veterinary clinics, and non-enabled spaces)
 * and provides methods to initialize and manage the map.
 * 
 * The map is represented as a 10x10 grid, where each cell is a string
 * indicating its type.
 */
public class Map {

    // -----------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------

    private final int ROWS = 10;
    private final int COLUMNS = 10;

    private final String AVAILABLE = "D ";
    private final String VETERINARY_CLINIC = "CV";
    private final String NOT_ENABLED = "  ";

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    private String[][] map;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    public Map() {

        map = new String[ROWS][COLUMNS];

        initializeMap();
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * Initializes the zoo map.
     *
     * The method must:
     * 1. Identify positions that are not enabled for construction.
     * 2. Mark enabled positions as AVAILABLE (D).
     * 3. Locate the Veterinary Clinic in its corresponding positions.
     */
    private void initializeMap() {

        // TODO:
        // Traverse the matrix and initialize all its positions.

        // TODO:
        // Identify the 2 x 2 blocks that correspond to enabled areas
        // and mark those positions as AVAILABLE (D).

        // TODO:
        // Place the Veterinary Clinic.
    }

    /**
     * Places the Veterinary Clinic on the map.
     *
     * The clinic always occupies:
     * (1,1), (1,2), (2,1), (2,2)
     */
    private void initializeVeterinaryClinic() {

        // TODO:
        // Assign VETERINARY_CLINIC to the corresponding positions.
    }

    /**
     * Calculates the number of positions currently available
     * for the construction of habitats.
     *
     * @return number of available positions.
     */
    public int countAvailablePositions() {

        int count = 0;

        // TODO:
        // Traverse the complete matrix.
        // Each time an AVAILABLE position is found,
        // increase count.

        return count;
    }

    /**
     * Returns a text representation of the complete zoo map,
     * including row and column indexes.
     *
     * @return map represented as a String.
     */
    public String getMapAsString() {

        String result = "";

        // TODO:
        // Add column indexes.

        // TODO:
        // Traverse each row.
        // Add the row index and the content of each position.

        return result;
    }

    /**
     * Returns the content of a specific map position.
     *
     * @param row    row index.
     * @param column column index.
     * @return content of the position.
     */
    public String getPosition(int row, int column) {

        return map[row][column];
    }
}