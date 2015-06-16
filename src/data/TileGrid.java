package data;

import static helpers.Artist.*;

/**
 * Created by Kukeke11 on 06/15/15.
 */
public class TileGrid {

    public Tile[][] map;

    public TileGrid() {
        map = new Tile[40][30];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = new Tile(i * 32, j * 32, 32, 32, TileType.Floor);
            }
        }
    }

    public TileGrid(int[][] newMap)
    {
        map = new Tile[40][30];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if( newMap[j][i] == 0)
                    map[i][j] = new Tile(i * 32, j * 32, 32, 32, TileType.Floor);
                else if( newMap[j][i] == 1)
                    map[i][j] = new Tile(i * 32, j * 32, 32, 32, TileType.WallVertical);
                else if( newMap[j][i] == 2)
                    map[i][j] = new Tile(i * 32, j * 32, 32, 32, TileType.WallHorizontal);
                else if( newMap[j][i] == 3)
                    map[i][j] = new Tile(i * 32, j * 32, 32, 32, TileType.WallLeftCornernDown);
                else if( newMap[j][i] == 4)
                    map[i][j] = new Tile(i * 32, j * 32, 32, 32, TileType.WallLeftCornerUp);
                else if( newMap[j][i] == 5)
                    map[i][j] = new Tile(i * 32, j * 32, 32, 32, TileType.WallRightCornerDown);
                else if( newMap[j][i] == 6)
                    map[i][j] = new Tile(i * 32, j * 32, 32, 32, TileType.WallRightCornerUp);
                else
                    map[i][j] = new Tile(i * 32, j * 32, 32, 32, TileType.FloorDown);
            }
        }
    }
    public void Draw() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                Tile t = map[i][j];
                DrawQuadTex(t.getTexture(), t.getX(), t.getY(), t.getWidth(), t.getHeight());
            }
        }
    }
}
