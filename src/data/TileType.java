package data;

/**
 * Created by Kukeke11 on 06/15/15.
 */
public enum TileType
{
    Floor("Floor", true, false), WallLeftCornernDown("WallLeftCornerDown", true, true),
    WallHorizontal("WallHorizontal", true,true), WallVertical("WallVertical", true, true),
    FloorDown("FloorDown", true, false), WallLeftCornerUp("WallLeftCornerUp", true, true),
    WallRightCornerDown("WallRightCornerDown", true, true), WallRightCornerUp("WallRightCornerUp", true, true);

    String textureName;
    boolean buildable, density;

    TileType(String textureName, boolean buildable, boolean density)
    {
        this.textureName = textureName;
        this.buildable = buildable;
        this.density = density;
    }
}
