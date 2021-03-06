/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing an available display plane.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDisplayPlanePropertiesKHR}, {@link KHRGetDisplayProperties2#vkGetPhysicalDeviceDisplayPlaneProperties2KHR GetPhysicalDeviceDisplayPlaneProperties2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code displayPlaneProperties} &ndash; an instance of the {@link VkDisplayPlanePropertiesKHR} structure.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDisplayPlaneProperties2KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkDisplayPlanePropertiesKHR VkDisplayPlanePropertiesKHR} displayPlaneProperties;
 * }</pre></code>
 */
public class VkDisplayPlaneProperties2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DISPLAYPLANEPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDisplayPlanePropertiesKHR.SIZEOF, VkDisplayPlanePropertiesKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISPLAYPLANEPROPERTIES = layout.offsetof(2);
    }

    VkDisplayPlaneProperties2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDisplayPlaneProperties2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayPlaneProperties2KHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link VkDisplayPlanePropertiesKHR} view of the {@code displayPlaneProperties} field. */
    public VkDisplayPlanePropertiesKHR displayPlaneProperties() { return ndisplayPlaneProperties(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDisplayPlaneProperties2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDisplayPlaneProperties2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayPlaneProperties2KHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplayPlaneProperties2KHR set(VkDisplayPlaneProperties2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDisplayPlaneProperties2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayPlaneProperties2KHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDisplayPlaneProperties2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayPlaneProperties2KHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDisplayPlaneProperties2KHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayPlaneProperties2KHR create() {
        return new VkDisplayPlaneProperties2KHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDisplayPlaneProperties2KHR} instance for the specified memory address. */
    public static VkDisplayPlaneProperties2KHR create(long address) {
        return new VkDisplayPlaneProperties2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPlaneProperties2KHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDisplayPlaneProperties2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPlaneProperties2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDisplayPlaneProperties2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDisplayPlaneProperties2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDisplayPlaneProperties2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDisplayPlaneProperties2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPlaneProperties2KHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPlaneProperties2KHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDisplayPlaneProperties2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayPlaneProperties2KHR.PNEXT); }
    /** Unsafe version of {@link #displayPlaneProperties}. */
    public static VkDisplayPlanePropertiesKHR ndisplayPlaneProperties(long struct) { return VkDisplayPlanePropertiesKHR.create(struct + VkDisplayPlaneProperties2KHR.DISPLAYPLANEPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDisplayPlaneProperties2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayPlaneProperties2KHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayPlaneProperties2KHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayPlaneProperties2KHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayPlaneProperties2KHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkDisplayPlaneProperties2KHR newInstance(long address) {
            return new VkDisplayPlaneProperties2KHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayPlaneProperties2KHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDisplayPlaneProperties2KHR.npNext(address()); }
        /** Returns a {@link VkDisplayPlanePropertiesKHR} view of the {@code displayPlaneProperties} field. */
        public VkDisplayPlanePropertiesKHR displayPlaneProperties() { return VkDisplayPlaneProperties2KHR.ndisplayPlaneProperties(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDisplayPlaneProperties2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayPlaneProperties2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDisplayPlaneProperties2KHR.Buffer pNext(@NativeType("void *") long value) { VkDisplayPlaneProperties2KHR.npNext(address(), value); return this; }

    }

}