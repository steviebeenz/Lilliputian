package me.godead.lilliputian;

/*
 * MIT License
 *
 * Copyright (c) 2020 GoDead
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Lilliputian {

    private final DependencyBuilder builder = new DependencyBuilder();

    @Nullable
    private static Plugin plugin = null;

    @Nullable
    public static String path = null;

    public Lilliputian(@NotNull Plugin plugin) {
        this.plugin = plugin;
        this.path = plugin.getDataFolder().getParent() + "/" + "LilliputianLibraries";
    }

    @NotNull
    public static Plugin getPlugin() {
        assert plugin != null : "Error. Plugin seems to be null";
        return plugin;
    }

    public DependencyBuilder getDependencyBuilder() {
        return builder;
    }
}
