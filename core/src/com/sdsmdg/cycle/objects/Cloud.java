package com.sdsmdg.cycle.objects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.sdsmdg.cycle.gameworld.GameWorld;

public class Cloud {

    private Vector2 position;
    private Sprite sprite;
    private Vector2 velocity;
    private float width, height;

    public Cloud(float width, float height, Vector2 position, Vector2 velocity, Sprite sprite) {
        this.height = height;
        this.position = position;
        this.sprite = sprite;
        this.velocity = velocity;
        this.width = width;
    }

    public void update(float delta) {
        position.x += velocity.x + delta;
        if(position.x > GameWorld.screenWidth) {
            position.x = -width;
        }
    }

    public void onDraw(SpriteBatch batcher) {
        batcher.draw(sprite,
                position.x, position.y,
                width, height);

    }

}
