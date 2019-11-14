# Smart Home for Dummies

Project for the Design Patterns class using three design patterns, at least one
from each group.

## Project goal and language

Create an App using Kotlin

## Structure of the project

### Devices

It can be a light bulb, which state can be modified

```Java
public class SimpleLight {
  boolean isOn = false;

  public void toggleLight(){
    this.isOn = !this.iOn;
  }
}

```

### Scenarios

From its simplest form, it can be just toggling a light on/off

It can also be a kitchen profile that triggers sets of actions based of pre conditions

The app must include ways to create new scenarios and even complex ones, like a party mode

### Creating scenarios

Using design patterns the app must elude how it could implement this feature, like creating scenarios step-by-step, adding many devices, pre conditions, etc

For this part, it suffices to just explain which pattern could achieve that feature.

### Adding users

The app can be accessed by many users with the same permissions


