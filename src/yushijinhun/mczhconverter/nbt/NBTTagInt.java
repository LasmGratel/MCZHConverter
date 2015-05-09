package yushijinhun.mczhconverter.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class NBTTagInt extends NBTBase.NBTPrimitive {
	/** The integer value for the tag. */
	private int data;

	NBTTagInt() {
	}

	public NBTTagInt(int data) {
		this.data = data;
	}

	/**
	 * Creates a clone of the tag.
	 */
	@Override
	public NBTBase copy() {
		return new NBTTagInt(data);
	}

	@Override
	public boolean equals(Object p_equals_1_) {
		if (super.equals(p_equals_1_)) {
			NBTTagInt var2 = (NBTTagInt) p_equals_1_;
			return data == var2.data;
		}
		return false;
	}

	@Override
	public byte getByte() {
		return (byte) (data & 255);
	}

	@Override
	public double getDouble() {
		return data;
	}

	@Override
	public float getFloat() {
		return data;
	}

	/**
	 * Gets the type byte for the tag.
	 */
	@Override
	public byte getId() {
		return (byte) 3;
	}

	@Override
	public int getInt() {
		return data;
	}

	@Override
	public long getLong() {
		return data;
	}

	@Override
	public short getShort() {
		return (short) (data & 65535);
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ data;
	}

	@Override
	void read(DataInput input, int depth, NBTSizeTracker sizeTracker) throws IOException {
		sizeTracker.read(32L);
		data = input.readInt();
	}

	@Override
	public String toString() {
		return "" + data;
	}

	/**
	 * Write the actual data contents of the tag, implemented in NBT extension classes
	 */
	@Override
	void write(DataOutput output) throws IOException {
		output.writeInt(data);
	}
}
